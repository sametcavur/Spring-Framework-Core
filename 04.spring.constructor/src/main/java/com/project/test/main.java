package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.DbConnection;

public class main {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DbConnection dbConnection = (DbConnection) configurableApplicationContext.getBean("dbConnection");
		dbConnection.getConnection();
		dbConnection.closeConnection();
		
		System.out.println("----------------------");
		DbConnection dbConnection2 = (DbConnection) configurableApplicationContext.getBean("dbConnectionDiger");
		dbConnection2.closeConnection();
		dbConnection2.getConnection();
	}
}
