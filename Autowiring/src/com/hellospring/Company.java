package com.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {


	@Autowired
	@Qualifier("sofDeptOne")
	//SoftwareDept sofDept;
	Departmant departmant; // achive fully loosely coupled using parent interface who hold child method
	
//	public Company() {
////		System.out.println("defalult");
//	}
//	
//	//@Autowired
//	public Company( SoftwareDept sofDept) {
//		this.sofDept = sofDept;
//	}
//	
//
//	@Autowired
//	public void setSofDept(@Qualifier("sofDeptOne") SoftwareDept sofDept) {
//		this.sofDept = sofDept;
//	}



	public void workingTeam() {
		if(departmant == null)
			System.out.println("Teams are not working .... ");
		else
			departmant.work();
	}

}
