package com.springdi;

public class Bike {

	String modelName;
	int price;

	public Bike() {
		System.out.println("Bike going on");
	}

	public Bike(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
		
		System.out.println("modelName : " + modelName + "\nprice : " + price);
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "modelName : " + modelName + "\nprice : " + price;
	}

}
