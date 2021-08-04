package com.spring.hibernate.SpringHibernate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Entity(name="dev_student")
//@Table(name="dev_tam_student")

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	
	@Id
	@Column(name="student_id_no")
	private int id;
	private String name;
	private String dep;
	private Training training;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	public Student(int id, String name, String dep, Training training) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.training = training;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	 
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", training=" + training + "]";
	}
	
	

}
