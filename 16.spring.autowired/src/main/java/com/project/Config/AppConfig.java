package com.project.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.project.db.MySqlDatabase;
import com.project.db.OracleDatabase;

@Configuration
@ComponentScan(value = "com.project")
public class AppConfig {	
	
	
	@Bean
	public OracleDatabase oracle() {
		return new OracleDatabase();
	}
	
	@Bean
	public MySqlDatabase mysql() {
		return new MySqlDatabase();
	}
	
	
	
	}

