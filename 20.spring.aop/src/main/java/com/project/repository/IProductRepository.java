package com.project.repository;

import java.util.List;

import com.project.model.Product;

public interface IProductRepository {
	Product saveProduct(Product product);
	List<Product> findProducts();
	Product findProductById(int productId);
	List<String> findProductNames();

}
