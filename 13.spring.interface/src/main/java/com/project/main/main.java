package com.project.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.CustomerManager;

public class main {
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerManager cm = (CustomerManager) context.getBean("mySqlConnection",CustomerManager.class);
		cm.openConnection();
		cm.closeConnection();
		
		CustomerManager cm1 = (CustomerManager) context.getBean("oracleConnection",CustomerManager.class);
		cm1.openConnection();
		cm1.closeConnection();
	
	}
}
