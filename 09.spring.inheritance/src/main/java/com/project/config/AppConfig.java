package com.project.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.db.DBConnection;
import com.project.db.Database;

@Configuration
public class AppConfig {
	
	@Bean
	public Database database() {
		List<String> list = new ArrayList();
		list.add("Samet");
		Database database = new Database("urlOrnek", "Samet", "1234",list);
		return database;
	}
	
	@Bean
	public DBConnection dbconnection() {
		DBConnection dbconnection = new DBConnection();
		dbconnection.setDatabase(database());
		return dbconnection;
	}

}
