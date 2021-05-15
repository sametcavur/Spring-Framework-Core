package com.project.database;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {
	private String username;
	private String password;
	
	private List<String> list;
	private Map<String,String> maps;
	
	
	
	public void openConnection() {
		System.out.println("Username :" + this.username);
		System.out.println("Password " + this.password);
		
		System.out.println("Listedekiler:");
		for (String ozellik : list) {
			System.out.println(ozellik);
		}
		System.out.println(" ");
		System.out.println("Maptekiler");
		Set<String> keys = this.maps.keySet();
		
		for (String key : keys) {
			System.out.println(maps.get(key));
		}
		
	}
	public void closeConnection() {
		
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	

}
