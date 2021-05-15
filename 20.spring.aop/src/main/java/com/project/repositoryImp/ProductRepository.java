package com.project.repositoryImp;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.project.jpaFactoryImp.JPAFactory;
import com.project.model.Product;
import com.project.queries.ProductQueries;
import com.project.repository.IProductRepository;

@Component
public class ProductRepository implements IProductRepository {
	JPAFactory jpafactory = new JPAFactory();
	EntityManager entityManager = jpafactory.getEntityManager();
	EntityTransaction entityTransaction = jpafactory.getEntityTransaction();

	@Override
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}
	
	@Override
	public List<Product> findProducts() {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProducts,Product.class);
		List<Product> products = typedQuery.getResultList();
		return products;
	}

	@Override
	public Product findProductById(int productId) {
		if(productId>0) {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProductById, Product.class);
		typedQuery.setParameter("productId", productId);
		Product product = typedQuery.getSingleResult();
		return product;
		}
		else {
			throw new RuntimeException();
		}
	}

	@Override
	public List<String> findProductNames() {
		TypedQuery<Product> typedQuery = this.entityManager.createQuery(ProductQueries.findProducts,Product.class);
		List<Product> productlist = typedQuery.getResultList();
		List<String> names = new ArrayList<String>();
		for (Product products : productlist) {
			names.add(products.getProductName());
		}
		return names;
	}
}
