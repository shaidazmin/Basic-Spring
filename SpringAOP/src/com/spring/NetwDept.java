package com.spring;

import org.springframework.stereotype.Component;

@Component
public class NetwDept {
	
//	public NetwDept() {
//		roboSoft();
//	}
	
	public void roboSoft(String deviceName, int numberDevice) {
		System.out.println("We are Network team of PixRobo");
		System.out.println("We are using for PixRobo : "+deviceName+" & Number of devices is : "+ numberDevice);
	}
}
