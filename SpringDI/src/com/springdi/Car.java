package com.springdi;

public class Car {
	
	 Shop shop;
	 String brand;
	 String topSpeed;
	
	public Car() {
		System.out.println("Awesome Car");
	}

	public Car(Shop shop, String brand) {
		this.shop = shop;
		this.brand = brand;
		
		System.err.println("Awesome Car");
	}
	
	
	public void details() {
		System.out.println("Brand : "+brand);
	}
	
	public void topSpeed() {
		System.out.println("TopSpeed : "+topSpeed);
	}
	
}
