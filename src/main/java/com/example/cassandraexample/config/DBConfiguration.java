package com.example.cassandraexample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {

	@Profile("dev")
	@Bean
	public String devDatabaseConnection()
	{
		System.out.println("dev Connectivity..............");
		
		return "DBxtrr Connection for Dev- Cassandra";
	}
	
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection()
	{
		System.out.println("prod Connectivity..............");
		
		return "DB Connection for Prod- Mysql";
	}
}
