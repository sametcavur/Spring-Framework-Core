package com.project.db;


public class MySqlDatabase implements IDatabase{
	private String url = "MySqlURL";
	private String username = "MySqlUsername";
	private String password = "MySqlPassword";

	public void openConnection() {
		System.out.println("Mysql a��ld�");
		System.out.println(this.url);
		System.out.println(this.username);
		System.out.println(this.password);
	}

	public void closeConnection() {
		System.out.println("Mysql Kapand�");
	}

	public MySqlDatabase() {}
	
}
