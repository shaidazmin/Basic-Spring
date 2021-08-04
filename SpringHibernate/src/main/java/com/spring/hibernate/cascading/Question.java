package com.spring.hibernate.cascading;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name = "cascading_question")
public class Question {
	
	@Id
	@Column(name ="question_id")
	private int id;
	
	@Column(name = "question_name")
	private String qName;
	
//	@OneToMany()
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade = CascadeType.ALL) //  fetch = FetchType.EAGER
	private List<Answer> answers;
	

	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Question(int id, String qName, List<Answer> answers) {
		super();
		this.id = id;
		this.qName = qName;
		this.answers = answers;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getqName() {
		return qName;
	}



	public void setqName(String qName) {
		this.qName = qName;
	}



	public List<Answer> getAnswers() {
		return answers;
	}



	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", qName=" + qName + ", answers=" + answers + "]";
	}
	
	
	
	
	
	

}
