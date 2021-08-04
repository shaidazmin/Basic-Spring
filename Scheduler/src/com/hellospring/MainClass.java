package com.hellospring;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		//new Timer().schedule(new SchedularTest(), 0, 1000);
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
	}

}


//class SchedularTest extends TimerTask{
//
//	@Override
//	public void run() {
//		System.out.println("Hello!");
//		
//	}
//	
//}
