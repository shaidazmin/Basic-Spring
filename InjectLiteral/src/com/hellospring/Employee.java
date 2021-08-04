package com.hellospring;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("${name}")
	private String name;
	@Value("${title}")
	private String title;
	@Value("${skill}")
	private String skill;
	
	
////	@Value("Naz Ahmed")
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
//	@Value("${skill}")
//	public void setSkill(String skill) {
//		this.skill = skill;
//	}
	
	
	public void details() {
		System.out.println("Employee details \nname : " + name + "\ntitle : " + title + "\nskill : " + skill);
	}
	
	
	

}
