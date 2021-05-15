package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Config.AppConfig;
import com.project.db.DbConnection;
import com.project.db.IDatabase;
import com.project.db.OracleDatabase;


public class main {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		 
		DbConnection db = (DbConnection) context.getBean("DbConnection");
		db.openConnection();
		
		
		context.close();
	}
}
