package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		SoftDept softDept = context.getBean("softDept", SoftDept.class);
//		// Join Point
//		softDept.roboSoft();
//		
		
		
//		HardDept hardDept = context.getBean("hardDept", HardDept.class);
//		// Join Point
//		int value = hardDept.roboHard();
//		System.out.println("App Main Value : "+value);
		
		
		
//		NetwDept netwDept = context.getBean("netwDept", NetwDept.class);
//		// Join Point
//		netwDept.roboSoft("Raspibary", 10);
		
	
	// AfterThrowing ......
		
		
//		MarkRobo markRobo = context.getBean("markRobo", MarkRobo.class);
//		try {
//			markRobo.roboMark();
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		// Around ............
		
		
		WorkRobo workRobo = context.getBean("workRobo", WorkRobo.class);
		int value = workRobo.roboWorkingHour(73, 10);
		System.out.println(value);
		
		
		
	}

}
