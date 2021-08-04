package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boss {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Company company = context.getBean("company", Company.class);
		company.workingTeam();

	}

}
