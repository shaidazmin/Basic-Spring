package com.hellospring;

public class Car implements Shop{

	@Override
	public void engine() {
		System.out.println("Car has been started. You can go for a test drive.");
		
	}

}
