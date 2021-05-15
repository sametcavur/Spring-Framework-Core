package com.project.db;

import org.springframework.beans.factory.annotation.Value;

public class Database {
	@Value("${url}")
	private String url;
	
	@Value("${uname}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	public Database() {}
	public Database(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
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
		return "Database [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}
