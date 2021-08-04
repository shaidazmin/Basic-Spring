package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusinessMan {

	public static void main(String[] args) {
		
		// Normal approach
		
//		Bike bike = new Bike();
//		
//		bike.setModelName("Yamaha V3");
//		bike.setPrice(270000);
		
//		System.out.println(bike.getModelName());
//		System.out.println(bike.getPrice());
		
//		System.out.println(bike.toString());
		
		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		
//		Bike bike2 = applicationContext.getBean("bike", Bike.class);
//		
//		System.out.println(bike2.toString());
		
		
		
		ApplicationContext apContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Car car = apContext.getBean("car", Car.class);
		
//		car.details();
//		car.topSpeed();
//		
//		Car car2 = apContext.getBean("car", Car.class);
//		car2.topSpeed = "1500";
//		
//		System.out.println("After setting Value ............");
//		car2.topSpeed();
		
		Truck truck = apContext.getBean("truck", Truck.class);
		
		
	
		

	}

}
