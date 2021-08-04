package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee = applicationContext.getBean("emp", Employee.class);
		employee.details();

	}

}
