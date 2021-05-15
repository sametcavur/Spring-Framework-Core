package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.config.AppConfig;
import com.project.db.DBConnection;
import com.project.db.Database;

public class main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection connection = (DBConnection) context.getBean("dbconnection");
		connection.openConnection();
		connection.closeConnection();
		
		System.out.println("*******************************");
		
		ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Database database = (Database) context1.getBean("mySql");
		DBConnection connection2 = new DBConnection();
		connection2.setDatabase(database);
		connection2.openConnection();
		connection2.closeConnection();
		
		System.out.println("-------------------------------------");
		Database database1 = (Database) context1.getBean("oracle");
		DBConnection connection3 = new DBConnection();
		connection3.setDatabase(database1);
		connection3.openConnection();
		connection3.closeConnection();
		
		System.out.println("/////////////////////////////////////");
		
		DBConnection connection4 = (DBConnection) context1.getBean("connection");
		connection4.openConnection();
		connection4.closeConnection();
		
	}
}
