package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.db.DbConnection;

@Configuration
public class AppConfig {
	@Bean
	public DbConnection dbConnection() {
		DbConnection dbConnection = new DbConnection();
		return dbConnection;
	}
	

}
