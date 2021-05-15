package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.database.DBConnection;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBConnection dbConnection = (DBConnection) configurableApplicationContext.getBean("dbConnection");
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
	}
}
