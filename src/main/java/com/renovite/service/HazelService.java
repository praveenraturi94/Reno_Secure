package com.renovite.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;
import com.hazelcast.query.SqlPredicate;
import com.renovite.dao.DBOperation;
import com.renovite.model.IsoData;
import com.renovite.model.IsoField;

@Service
public class HazelService {

	@Autowired
	DBOperation dbOperations;
	
	@Autowired
	ParsingIsoData parsingIsoData;

	public void PopulateHazelcast() {
		HazelcastInstance client = getHazelCastClientInstance();
		Map<String,IsoData> clientList = client.getMap("IsoData");
		
		clientList.putAll(dbOperations.findAllBetween());
	}

	public Collection<IsoData> FetchAllHazelcastData(String query) {
		HazelcastInstance client = getHazelCastClientInstance();
		IMap<String,IsoData> clientMap = client.getMap("IsoData");
//		System.out.println(clientMap.values());
//		EntryObject e = new PredicateBuilder().getEntryObject();
//		Predicate<String,IsoData> predicate = e.is( "41758" );
		Collection<IsoData> isodata = clientMap.values(new SqlPredicate( query ));

		return isodata;
	}

	public IsoField ParseIsoRequest() {
		String data="0100B23F4401A8E080080000000000000004000000000000441253205721110218101102110255420211100000000009110000000000934B5262544901468123D181010114991888F0128867042750000002900000000018456797802610400140028000000000000000015000000000000001";
		IsoField parsedData = parsingIsoData.parsingData(data);
		return parsedData;
	}
	
	public void insertRule() {
		System.out.println("TTTTTTTT");
		HazelcastInstance client = getHazelCastClientInstance();
		IMap<Object, Object> clientMap = client.getMap("rule");
		Map<String,String> rules = readAllDRLFiles();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$444");
		System.out.println(rules);
		clientMap.putAll(rules);
	}

	public String fetchRule(String key) {
		HazelcastInstance client = getHazelCastClientInstance();
		Map<String, String> clientMap = client.getMap("rule");
		System.out.println("################");
		System.out.println(clientMap.get(key));
		return clientMap.get(key).toString();
	}

	@SuppressWarnings("deprecation")
	public HazelcastInstance getHazelCastClientInstance() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("localhost:5701");
		
		return HazelcastClient.newHazelcastClient(clientConfig);
	}

	public Map<String,String> readAllDRLFiles() {

		File folder = new File("src/main/resources/rules");
		File[] listOfFiles = folder.listFiles();
		Map<String,String> rules = new HashMap<String,String>();
		try {

			for (int i = 0; i < listOfFiles.length; i++) {
				File file = listOfFiles[i];
				BufferedReader br = new BufferedReader(new FileReader(file));

				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append("\n");
					line = br.readLine();
				}
				String rule = sb.toString();
				String fileNameWithOutExt = FilenameUtils.removeExtension(listOfFiles[i].getName());
System.out.println("############################## "+fileNameWithOutExt);
				br.close();
				rules.put(fileNameWithOutExt,rule);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rules;
	}

}
