package com.project.jpaFactoryImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.jpaFactory.IJPAFactory;

public class JPAFactory implements IJPAFactory{
	EntityManager entityManager;
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction transaction = entityManager.getTransaction();
		return transaction;
	}

}
