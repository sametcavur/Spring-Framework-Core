package com.project.db;

import org.springframework.beans.factory.annotation.Required;

public class MySqlDatabase implements IDatabase{
	private String url;
	private String username;
	private String password;

	@Override
	public void openConnection() {
		// TODO Auto-generated method stub
		System.out.println("Mysql açýldý");
		System.out.println(this.url);
		System.out.println(this.username);
		System.out.println(this.password);
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Kapandý");
	}

	public MySqlDatabase() {}
	public MySqlDatabase(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
