package com.project.db;

public class CustomerManager {
	IDatabaseConnection IDatabaseConnection;
	
	
	public CustomerManager(IDatabaseConnection IDatabaseConnection) {
		this.IDatabaseConnection = IDatabaseConnection;
	}
	public void openConnection() {
		IDatabaseConnection.openConnection();
	}
	public void closeConnection() {
		IDatabaseConnection.closeConnection();
	}
}
