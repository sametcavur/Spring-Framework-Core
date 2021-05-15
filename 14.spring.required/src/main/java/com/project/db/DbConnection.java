package com.project.db;

public class DbConnection {
	IDatabase IDatabase;

	public DbConnection() {
		// TODO Auto-generated constructor stub
	}

	public DbConnection(IDatabase IDatabase) {
		this.IDatabase = IDatabase;
	}

	public void openConnection() {
		IDatabase.openConnection();
	}
	public void closeConnection() {
		IDatabase.closeConnection();
	}
	
	public IDatabase getIDatabase() {
		return IDatabase;
	}

	public void setIDatabase(IDatabase iDatabase) {
		IDatabase = iDatabase;
	}
	
	

	
	
}
