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
		
		context.close();
		System.out.println("*******************************");
		
		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection connection4 = (DBConnection) context1.getBean("connection");
		connection4.openConnection();
		context1.close();
		
	}
}
