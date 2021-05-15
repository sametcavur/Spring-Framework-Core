package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.db.DbConnection;

@Configuration
public class AppConfig {
	
	@Bean
	public DbConnection ConnectionDb() {
		DbConnection dbConnection = new DbConnection();
		dbConnection.setUrl("222");
		dbConnection.setUsername("ssss");
		dbConnection.setPassword("9999");
		return dbConnection;
	}

}
