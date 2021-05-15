package com.project.db;

public class DbConnection {
	Database database;
	
	public void openConnection() {
		System.out.println("Database Açıldı.");
		System.out.println("URL =" + database.getUrl());
		System.out.println("Username =" + database.getUsername());
		System.out.println("Password =" + database.getPassword());
	}
	public void closeConnection() {
		System.out.println("Database Kapatıldı.");
	}
	
	public Database getDatabase() {
		return database;
	}
	public void setDatabase(Database database) {
		this.database = database;
	}
}
