package com.project.db;

public class MySqlConnection implements IDatabaseConnection{

	@Override
	public void openConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySql Baðlandý");
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySql Kapandý");
	}

}
