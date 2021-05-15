package com.project.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.model.Product;
import com.project.model.User;
import com.project.repository.IProductRepository;
import com.project.repository.IUserRepository;

public class Main {
	public static void main(String[] args) {
	
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	IProductRepository repository = context.getBean("productRepository",IProductRepository.class);
	Product product = repository.findProductById(6);
	System.out.println(product);
	/*
	IUserRepository repository2 = context.getBean("userRepository",IUserRepository.class);
	List<User> user = repository2.findUsers();
	for (User user2 : user) {
		System.out.println(user2);
	}
	*/
	/* UserRepository repository = new UserRepository();
	List<User> list = repository.findUsers();
	for (User user : list) {
		System.out.println(user);
	} */
	}
}
