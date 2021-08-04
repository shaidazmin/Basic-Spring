package com.sequence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.AppConfig;

public class Calculator {

	public static void main(String[] args) {
	
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Operation operation = context.getBean("operation", Operation.class);
		operation.sum(45, 96);
		

	}

}
