package com.project.db;

public class DBConnection {
	Database database;
	
	public void openConnection() {
		System.out.println("Database Baðlantý oluþtu");
		System.out.println("URL= " + database.getUrl());
		System.out.println("UserName= " + database.getUsername());
		System.out.println("Password= " + database.getPassword());
		System.out.println("Listenin Elemaný");
		for (String eleman : database.getListe()) {
			System.out.println(eleman);
		}
	}
	public void closeConnection() {
		System.out.println("Database baðlantý kapatýldý");
	}
	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	

}
