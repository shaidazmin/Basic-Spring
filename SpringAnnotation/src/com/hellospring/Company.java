package com.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	@Qualifier("softwareEngineer")
	Engineers enginner;
	
	@Value("${companyName}")
	String companyName;
	
//	@Autowired
//	public Company(SoftwareEngineer engineer) {
//		this.enginner = engineer;
//	}
	


//	@Autowired
//	public void setEnginner(SoftwareEngineer enginner) {
//		this.enginner = enginner;
//	}


	public void showInfo() {
		System.out.println(companyName);
		//System.out.println("Company inoforamtion here .... ");
	}
}
