package com.project.db;

import java.util.List;

public class Database {

	private String url;
	private String username;
	private String password;
	private List<String> liste;
	public Database() {
		// TODO Auto-generated constructor stub
	}
	
	public Database(String url, String username, String password, List<String> liste) {
		this.url = url;
		this.username = username;
		this.password = password;
		this.liste = liste;
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
	
	public List<String> getListe() {
		return liste;
	}
	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + ", liste=" + liste + "]";
	}

}
