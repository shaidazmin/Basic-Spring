package com.hellospring;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

//	@Scheduled(fixedDelay = 1000)
	// second, min, hour, dayofmounth, month, dayofweek
//	@Scheduled(cron = "*/4 * * * * * ")
	
	@Scheduled(fixedRate  = 2000)
	public void showBannerText() {
		System.out.println("Welocme to naztech Inc.");
	}
}
