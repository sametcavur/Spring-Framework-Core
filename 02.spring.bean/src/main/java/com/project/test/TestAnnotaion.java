package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.config.AppConfig;
import com.project.db.DbConnection;

public class TestAnnotaion {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DbConnection dbConnection = configurableApplicationContext.getBean(DbConnection.class);
		dbConnection.connectDatabase();
		dbConnection.closeDatabase();
		
		
		
		configurableApplicationContext.close();
	}

}
