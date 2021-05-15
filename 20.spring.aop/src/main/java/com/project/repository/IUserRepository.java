package com.project.repository;

import java.util.List;

import com.project.model.Product;
import com.project.model.User;

public interface IUserRepository {
	User saveUser(User user);
	User findUserById(int userId);
	List<User> findUsers();
	List<String> findUsersNames();
	List<Product> findUsersProductsById(int userId);

}
