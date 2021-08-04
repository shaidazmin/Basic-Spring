package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HeadQuarter {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Company company = (Company) applicationContext.getBean("company");
		company.showInfo();
		
		company.enginner.development();
		
	}
	
}
