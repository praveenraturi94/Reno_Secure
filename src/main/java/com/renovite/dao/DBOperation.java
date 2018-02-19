package com.renovite.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.renovite.model.Employee;
import com.renovite.model.IsoData;

@Transactional
public interface DBOperation {

	List<Employee> findAllEmployee();
	 List<IsoData> findAll() ;

	void addEmployee(Employee employee);
}
