package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.Database;
import com.project.db.DbConnection;

public class main {
	public static void main(String[] args) {
	
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DbConnection dbConnection2 = (DbConnection) applicationContext.getBean("DbConnection");
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		
	
	}
}
