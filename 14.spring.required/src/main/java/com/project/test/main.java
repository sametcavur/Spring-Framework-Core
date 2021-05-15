package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.DbConnection;

public class main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DbConnection connection = (DbConnection) context.getBean("Oracleconnection");
		connection.openConnection();
		connection.closeConnection();
		
		DbConnection connection1 = (DbConnection) context.getBean("Mysqlconnection");
		connection1.openConnection();
		connection1.closeConnection();
		
		
	}
}
