package com.spring;

import org.springframework.stereotype.Component;

@Component
public class MarkRobo {
	
	public String roboMark() throws MyException {
		
		throw new MyException("Error From my Exception ");
	}

}
