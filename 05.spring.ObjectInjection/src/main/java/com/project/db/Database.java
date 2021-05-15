package com.project.db;

public class Database {
	private String url;
	private String username;
	private String password;
	
	public  Database() {}
	public  Database(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public void getConnection() {
		System.out.println("URL= " + url);
		System.out.println("Username= " + this.username);
		System.out.println("password= " + this.password);
		System.out.println("Baðlantý açýldý");
	}
	public void closeConnection() {
		System.out.println("Baðlantý kapatýldý");
	}
	public String getUrl() {
		return url;
	}
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
	@Override
	public String toString() {
		return "DbConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
