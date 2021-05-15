package com.project.queries;

@SuppressWarnings("unused")
public class UserQueries {
	public static final String findUsers ="SELECT u FROM User u";
	public static final String findUserById ="SELECT u FROM User u WHERE u.userId = :userId";
	public static final String findUserNames ="SELECT u.userName FROM User u";
	public static final String findUsersProductsById = " SELECT u.products FROM User u WHERE u.userId = :userId";

}
