package com.springdi;

public class Shop {

	//public void engine();
	
	String modelName;
	int price;
	
	public Shop() {
		System.out.println("Awesome Shop");
	}
	

	public Shop(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
		
		System.out.println("modelName : " + modelName + "\nprice : "+price);
	}
	
	
}
