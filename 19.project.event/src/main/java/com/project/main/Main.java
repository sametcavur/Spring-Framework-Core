package com.project.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.eventPublisher.EventPublisher;

public class Main {
	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	applicationContext.start();
	
	EventPublisher publisher = applicationContext.getBean("eventPublisher",EventPublisher.class);
	publisher.userRegisterSendMail();
	
	applicationContext.stop();

}
}