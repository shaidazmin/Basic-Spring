package com.spring.hibernate.cascading;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "cascading_answer")
public class Answer {
	
	
	@Id
	@Column(name ="answer_id")
	private int id;
	@Column(name = "question_answer")
	private String qAnswer;
	
	@ManyToOne()
	private Question question;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int id, String qAnswer) {
		super();
		this.id = id;
		this.qAnswer = qAnswer;
	}
	
	
	public Answer(int id, String qAnswer, Question question) {
		super();
		this.id = id;
		this.qAnswer = qAnswer;
		this.question = question;
	}
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getqAnswer() {
		return qAnswer;
	}
	public void setqAnswer(String qAnswer) {
		this.qAnswer = qAnswer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", qAnswer=" + qAnswer + "]";
	}
	
	
	

}
