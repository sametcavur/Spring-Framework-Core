package com.project.db;

public class OracleConnection implements IDatabaseConnection {

	@Override
	public void openConnection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Ba�land�");
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Kapand�");
	}

}
