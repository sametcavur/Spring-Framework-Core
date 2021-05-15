package com.project.insertData;


import java.util.ArrayList;
import java.util.List;

import com.project.model.Product;
import com.project.model.User;
import com.project.repositoryImp.ProductRepository;
import com.project.repositoryImp.UserRepository;


public class Insert {
	static ProductRepository repository = new ProductRepository();
	static UserRepository repository1 = new UserRepository();
	
	public static void insertProduct() {
	Product product1 = new Product("Iphone 12 Pro Max",500,20000);
	Product product2 = new Product("Huawei MateBook",350,11000);
	Product product3 = new Product("Xiamio Mi Pro",800,7000);
	Product product4 = new Product("Samsung Galaxy S20",600,10500);
	Product product5 = new Product("Iphone 7 Pro",300,5000);
	Product product6 = new Product("Dell MBook",150,18000);
	Product product7 = new Product("Oppo Reno",100,4000);
	Product product8 = new Product("Samsung Ultra Max",1000,13700);
	
	List<Product> list1 = new ArrayList<Product>(); 
	list1.add(product1);
	list1.add(product2);
	list1.add(product3);
	List<Product> list2 = new ArrayList<Product>(); 
	list2.add(product4);
	list2.add(product5);
	list2.add(product6);
	List<Product> list3 = new ArrayList<Product>(); 
	list3.add(product7);
	list3.add(product8);
	
	User user1 = new User("Samet", "Çavur", list3);
	User user2 = new User("Maho", "Resuk", list1);
	User user3 = new User("Mehmet", "Çýnar", list2);
	
	repository.saveProduct(product1);
	repository.saveProduct(product2);
	repository.saveProduct(product3);
	repository.saveProduct(product4);
	repository.saveProduct(product5);
	repository.saveProduct(product6);
	repository.saveProduct(product7);
	repository.saveProduct(product8);
	
	repository1.saveUser(user1);
	repository1.saveUser(user2);
	repository1.saveUser(user3);
	
	
	}
	
	
}
