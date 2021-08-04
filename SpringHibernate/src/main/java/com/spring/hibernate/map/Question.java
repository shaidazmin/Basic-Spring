package com.spring.hibernate.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Question {
	
	@Id
	@Column(name ="question_id")
	private int id;
	@Column(name = "question_name")
	private String qName;
	@OneToOne
	@JoinColumn(name = "answer_id")
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String qName, Answer answer) {
		super();
		this.id = id;
		this.qName = qName;
		this.answer = answer;
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
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", qName=" + qName + ", answer=" + answer + "]";
	}
	
	
	
	

}
