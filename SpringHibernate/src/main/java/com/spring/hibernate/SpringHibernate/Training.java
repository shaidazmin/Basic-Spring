package com.spring.hibernate.SpringHibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Training {
	
	@Column(name="traing_id_no")
	private int t_id;
	@Column(name="traing_name")
	private String trainingName;
	@Column(name="trainer_name")
	private String instructorName;
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(int t_id, String trainingName, String instructorName) {
		super();
		this.t_id = t_id;
		this.trainingName = trainingName;
		this.instructorName = instructorName;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	

}
