package com.project.db;

public class DBConnection {
	Database database;
	
	public void openConnection() {
		System.out.println("Database Ba�lant� olu�tu");
		System.out.println("URL= " + database.getUrl());
		System.out.println("UserName= " + database.getUsername());
		System.out.println("Password= " + database.getPassword());
		
	}
	@SuppressWarnings("unused")
	private void closeConnection() {
		System.out.println("DATABASE KAPATILDI....!");
	}
	
	@SuppressWarnings("unused")
	private void validation() {
		if(database.getUrl() == null || database.getUsername() == null || database.getPassword()==null) {
			System.out.println("VeriTaban�na Giri� Yap�lamad�");
			throw new NullPointerException("HATA!HATA!HATA!HATA!");
		}
		else {
			System.out.println("Giri� Ba�ar�l�d�r.Metod �al��t�....!");
		}
	}
	public Database getDatabase() {
		return database;
	}
	public void setDatabase(Database database) {
		this.database = database;
	}
	

}
