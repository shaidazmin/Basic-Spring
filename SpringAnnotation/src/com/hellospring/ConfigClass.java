package com.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.hellospring")
@PropertySource("classpath:info")
public class ConfigClass {

//	@Bean
//	public Company company() {
//		// return new Company();
//		
//		//using Constractor
//		Company company = new Company(engineer());
//		return company;
//
//		//using setter method
////		Company company = new Company();
////		company.setEnginner(engineer());
////		return company;
//	}
//
//	@Bean
//	public SoftwareEngineer engineer() {
//		return new SoftwareEngineer();
//	}

}
