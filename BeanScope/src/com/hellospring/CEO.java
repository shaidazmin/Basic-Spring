package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CEO {

	public static void main(String[] args) {
	
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = applicationContext.getBean("employee", Employee.class);
		emp.name="naztech Inc.";
		System.out.println(emp.name);
//		
//		Employee emp2 = applicationContext.getBean("employee", Employee.class);
//		System.out.println(emp2.name);
		
//		if(applicationContext.getBean("employee", Employee.class) == applicationContext.getBean("employeeBeanTwo", Employee.class))
//			System.out.println("One Bean Created");
//		else
//			System.out.println("Two Bean Created");

	}

}
