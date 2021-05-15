package com.project.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.DbConnection;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		DbConnection db = (DbConnection) beanFactory.getBean("dbConnection");
		db.connectDatabase();
		db.closeDatabase();
		
	}
}
