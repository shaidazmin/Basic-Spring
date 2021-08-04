package com.spring.hibernate.mtm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int e_id;
	
	private String e_name;
	
	@ManyToMany
	private List<Projects> porjects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public List<Projects> getPorjects() {
		return porjects;
	}

	public void setPorjects(List<Projects> porjects) {
		this.porjects = porjects;
	}
	
	
	

}
