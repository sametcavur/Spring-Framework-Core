package com.project.queries;

@SuppressWarnings("unused")
public class ProductQueries {
	public static final String findProducts ="SELECT p FROM Product p";
	public static final String findProductById ="SELECT p FROM Product p WHERE p.productId = :productId";
	public static final String findProductNames ="SELECT p.productName FROM Product p";
	public static final String findGreatPrice ="SELECT p FROM Product p WHERE p.unitPrice > :unitPrice";

}
