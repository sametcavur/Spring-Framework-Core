package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.project.db.Database;
import com.project.db.DbConnection;

@Configuration 
@PropertySources({
	@PropertySource("values.properties"),
	@PropertySource("diger.properties"),
	@PropertySource("obur.properties")
})
public class AppConfig {
	@Bean
	public Database database() {
		Database database = new Database();
		return database;
	}
	@Bean
	public DbConnection dbconnection() {
		
		DbConnection dbconnection = new DbConnection();
		dbconnection.setDatabase(database());
		return dbconnection;
	}

	
}
