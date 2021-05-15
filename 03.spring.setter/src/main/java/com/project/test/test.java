package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.config.AppConfig;
import com.project.db.DbConnection;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new  AnnotationConfigApplicationContext(AppConfig.class);
		DbConnection dbConnection = (DbConnection) configurableApplicationContext.getBean("ConnectionDb");
		dbConnection.getConnection();
		dbConnection.closeConnection();
		configurableApplicationContext.close();
		System.out.println("------------------");
		ConfigurableApplicationContext configurableApplicationContext2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		DbConnection dbConnection2 = (DbConnection) configurableApplicationContext2.getBean("DbConnectionXML");
		dbConnection2.getConnection();
		dbConnection2.closeConnection();
		configurableApplicationContext2.close();
	}
}
