package com.hellospring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardWareEngineer implements Engineers {
	public void development() {
		System.out.println("HardWare Development team are working here ...... ");
	}
}
