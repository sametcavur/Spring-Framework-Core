package com.project.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DbConnection")
public class DbConnection {
	
	@Autowired
	IDatabase IDatabase;

	public DbConnection() {
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
