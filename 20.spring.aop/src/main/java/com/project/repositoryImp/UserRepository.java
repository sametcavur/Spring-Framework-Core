package com.project.repositoryImp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.project.jpaFactoryImp.JPAFactory;
import com.project.model.Product;
import com.project.model.User;
import com.project.queries.UserQueries;
import com.project.repository.IUserRepository;

@Component
public class UserRepository implements IUserRepository {
	JPAFactory jpafactory = new JPAFactory();
	EntityManager entityManager = jpafactory.getEntityManager();
	EntityTransaction entityTransaction = jpafactory.getEntityTransaction();

	@Override
	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	@Override
	public User findUserById(int userId) {
		TypedQuery<User> typedQuery = this.entityManager.createQuery(UserQueries.findUserById,User.class);
		typedQuery.setParameter("userId", userId);
		User user = typedQuery.getSingleResult();
		return user;
	}

	@Override
	public List<User> findUsers() {
		TypedQuery<User> typedQuery = this.entityManager.createQuery(UserQueries.findUsers,User.class);
		List<User> users = typedQuery.getResultList();
		return users;
	}

	@Override
	public List<String> findUsersNames() {
		TypedQuery<User> typedQuery = this.entityManager.createQuery(UserQueries.findUserNames,User.class);
		List<User> userlist = typedQuery.getResultList();
		List<String> names = new ArrayList<String>();
		for (User user : userlist) {
			names.add(user.getUserName());
		}
		return names;
	}

	@Override
	public List<Product> findUsersProductsById(int userId) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(UserQueries.findUsersProductsById,Product.class);
		typedQuery.setParameter("userId", userId);
		List<Product> products = typedQuery.getResultList();
		return products;
	}
}
