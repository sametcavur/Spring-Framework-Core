package com.project.db;

public class DbConnection {
	private Database database;
	
	public void openConnection() {
		System.out.println("URL =" + this.database.getUrl());
		System.out.println("Username =" + this.database.getUsername());
		System.out.println("Password =" + this.database.getPassword());
		System.out.println("Baðlantý oluþtu");
	}
	 public void closeConnection() {
		 System.out.println("Baðlantý kapatýldý.");
	 }
	 public void setDatabase(Database database) {
		this.database = database;
	}
	 public Database getDatabase() {
		return database;
	}
	@Override
	public String toString() {
		return "DbConnection [database=" + database + "]";
	}
	 
}
