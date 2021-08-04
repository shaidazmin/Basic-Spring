package com.spring;

import org.springframework.stereotype.Component;

@Component
public class WorkRobo {
	
	public int roboWorkingHour(int chargePercent, int howManyWork) {
		System.out.println("Robo working hour : "+(chargePercent * 5 - howManyWork));
		return (chargePercent * 5) - howManyWork;
		
	}

}
