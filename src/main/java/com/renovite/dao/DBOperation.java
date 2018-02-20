package com.renovite.dao;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.renovite.model.Employee;
import com.renovite.model.IsoData;

@Transactional
public interface DBOperation {

	List<Employee> findAllEmployee();
	 List<IsoData> findAll() ;
	 Map<String,IsoData> findAllBetween() ;

	void addEmployee(Employee employee);
}
