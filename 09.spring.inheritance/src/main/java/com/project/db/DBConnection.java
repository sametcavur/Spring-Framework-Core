package com.project.db;

public class DBConnection {
	Database database;
	
	public void openConnection() {
		System.out.println("Database Ba�lant� olu�tu");
		System.out.println("URL= " + database.getUrl());
		System.out.println("UserName= " + database.getUsername());
		System.out.println("Password= " + database.getPassword());
		System.out.println("Listenin Eleman�");
		for (String eleman : database.getListe()) {
			System.out.println(eleman);
		}
	}
	public void closeConnection() {
		System.out.println("Database ba�lant� kapat�ld�");
	}
	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	

}
