package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.db.Database;
import com.project.db.DbConnection;

@Configuration
public class AppConfig {
	@Bean
	public Database ConnectionDb() {
		Database dbConnection = new Database();
		dbConnection.setUrl("222");
		dbConnection.setUsername("ssss");
		dbConnection.setPassword("9999");
		return dbConnection;
	}

}
