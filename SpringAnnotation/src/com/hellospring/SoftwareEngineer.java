package com.hellospring;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineers {
	public void development() {
		System.out.println("Software Development team are working here ...... ");
	}

}
