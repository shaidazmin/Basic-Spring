package com.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
public class AppConfig {
	
//	@Bean
////	@Scope(scopeName = "singleton")
//	@Scope(scopeName = "prototype")
//	public Employee employee() {
//		return new Employee();
//	}
	
//	@Bean
////	@Scope(scopeName = "singleton")
//	@Scope(scopeName = "prototype")
//	public Employee employeeBeanTwo() {
//		return new Employee();
//	}
	
	
	
	@Bean
	@Lazy
	public Employee employee() {
		return new Employee();
	}

}
