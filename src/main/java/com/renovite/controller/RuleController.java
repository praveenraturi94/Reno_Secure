package com.renovite.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renovite.dao.DBOperation;
import com.renovite.model.*;
import com.renovite.service.HazelService;
import com.renovite.service.RuleService;

@RestController
public class RuleController {


	    @Autowired
	    DBOperation dbOperations;
	    
	    @Autowired
	    HazelService hazel;
	    
	    @Autowired
	    RuleService ruleService;
	    
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}

	//populate hazelcast with the database data 
	@RequestMapping("/populateHazel")
	public String populateHazel() {
		hazel.PopulateHazelcast();
		return "Hazel data successfully populated";
	}
	
	//retrive all the data that is in the hazelcast
	@RequestMapping("/fetchAllHazelData")
	public Collection<IsoData> fetchAllHazelData() {
		
		return hazel.FetchAllHazelcastData("AUTH_SERIAL_NO=1521553");
	}
	

	//it will read all the drl files and then insert the rules in the hazelcast
	@RequestMapping("/insertRules")
	public String insertRules() {
	hazel.insertRule();
	return "Rule succesfully inserted";
	}
	
	@RequestMapping("/executeRules")  //It will execute all rules that are in hazelcast 
	public String executeRules() {
		String rule = hazel.fetchRule("Card");
		
		return "failed rules : "+ruleService.executeRule(rule);
	}
	
	@RequestMapping("/fetchRules")  //It will execute all rules that are in hazelcast 
	public String fetchRules() {
		String rule = hazel.fetchRule("Card");
		return rule;
	}
	@RequestMapping("/fetchAll")
	public List<IsoData> FetchAllRecords() {
		return dbOperations.findAll();
	}
	@RequestMapping("/fetchAllBetween")
	public Map<String,IsoData> FetchAllRecordsBetween() {
		return dbOperations.findAllBetween();
	}
}
