package com.renovite.dao;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.renovite.model.IsoData;

@Transactional
public interface DBOperation {

	 Map<String,IsoData> findAllBetween() ;

}
