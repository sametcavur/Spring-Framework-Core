package com.project.test;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.config.AppConfig;
import com.project.db.DbConnection;

public class main {

	 public static void main(String[] args) {
		 
		 
		ConfigurableApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
		 
		 DbConnection db = applicationContext.getBean(DbConnection.class);
		 
		 db.openConnection();
		 db.closeConnection();
		 
		 applicationContext.close();
		
		 System.out.println("---------------------------------------------");
		 
		 
		 ConfigurableApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 DbConnection db1 = (DbConnection) applicationContext2.getBean("connection");
		 db1.openConnection();
		 db1.closeConnection();
		 		 
		 applicationContext2.close();
	}
	
	 
}
