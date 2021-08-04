package com.springdi;

public class Truck {

	Shop shop;
	
	public Truck(Shop shop) {
		this.shop = shop;
		System.err.println("Awesome Truck");
	}
}
