package com.project.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.bean.factory.BeanFactory;
import com.project.db.DBConnection;
import com.project.db.Database;

@Configuration
public class AppConfig {
	
	@Bean
	public Database database() {
		Database database = new Database("urlOrnek", "Samet", "1123");
		return database;
	}
	@Bean (initMethod = "validation", destroyMethod = "closeConnection")
	public DBConnection dbconnection() {
		
		DBConnection dbconnection = new DBConnection();
		dbconnection.setDatabase(database());
		return dbconnection;
	}
	
	@Bean 
	public BeanFactoryPostProcessor beanFactory() {
		return new BeanFactory();
	}
	
	

}
