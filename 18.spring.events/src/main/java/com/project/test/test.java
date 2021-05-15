package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.publisher.UserSendMailPublisher;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserSendMailPublisher publisher = (UserSendMailPublisher) context.getBean("userSendMailPublisher");
		publisher.userRegisterMessage();
		
		
		context.close();
	}
}
