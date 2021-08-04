package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BusinessMan {

	public static void main(String[] args) {
		
//		new TestDrive().startDriving(new Bike());
//		
//		new TestDrive().startDriving(new Car());
//		
//		new TestDrive().startDriving(new Helicopter ());
		
//		Shop shop = new Car();
//		
//		new TestDrive().startDriving(shop);
		
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
	
	
	
	
	//Bike bike = (Bike) applicationContext.getBean("shop");
	
	//Shop shop = (Shop) applicationContext.getBean("shop");
	
	Shop shop =  applicationContext.getBean("shop", Shop.class);
	
	new TestDrive().startDriving(shop);
	
			
			
	
		
	}

}
