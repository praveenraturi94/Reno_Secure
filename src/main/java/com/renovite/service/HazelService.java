package com.renovite.service;

import static org.assertj.core.api.Assertions.entry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.renovite.dao.DBOperation;
import com.renovite.model.IsoData;

@Service
public class HazelService {

	@Autowired
	DBOperation dbOperations;

	public void PopulateHazelcast() {
		HazelcastInstance client = getHazelCastClientInstance();
		List<IsoData> clientList = client.getList("IsoData");
		clientList.addAll(dbOperations.findAll());
	}

	public List<IsoData> FetchAllHazelcastData() {
		HazelcastInstance client = getHazelCastClientInstance();
		List<IsoData> clientList = client.getList("IsoData");
		return clientList;
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
