package com.project.db;

public class DBConnection {
	Database database;
	
	public void openConnection() {
		System.out.println("Database Baðlantý oluþtu");
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
			System.out.println("VeriTabanýna Giriþ Yapýlamadý");
			throw new NullPointerException("HATA!HATA!HATA!HATA!");
		}
		else {
			System.out.println("Giriþ Baþarýlýdýr.Metod Çalýþtý....!");
		}
	}
	public Database getDatabase() {
		return database;
	}
	public void setDatabase(Database database) {
		this.database = database;
	}
	

}
