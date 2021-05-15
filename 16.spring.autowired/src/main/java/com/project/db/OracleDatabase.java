package com.project.db;


	public class OracleDatabase implements IDatabase {
	private String url = "OracleURL";
	private String username = "OracleUsername";
	private String password = "OraclePassword";

	@Override
	public void openConnection() {
		System.out.println("Oracle Açýldý");
		System.out.println(this.url);
		System.out.println(this.username);
		System.out.println(this.password);
	}

	@Override
	public void closeConnection() {
		System.out.println("Oracle Kapandý");
		
	}
	public OracleDatabase() {}
	
}
