package com.renovite.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.renovite.controller", "com.renovite.dao", "com.renovite.model", "com.renovite.service" })
public class FraudDetectionApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FraudDetectionApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FraudDetectionApplication.class, args);
	}

}
