package com.project.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.project.db.DbConnection;
import com.project.db.IDatabase;
import com.project.db.MySqlDatabase;
import com.project.db.OracleDatabase;

@Configuration
@ComponentScan(value = "com.project")
public class AppConfig {	
		
	@Bean
	public IDatabase IDatabase() {
		return new OracleDatabase();
	}
	}

