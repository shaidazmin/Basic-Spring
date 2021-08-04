package com.spring.hibernate.otm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		// Session .................

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//	 // Create  a Question ..... 
//	 
//		Question question = new Question();
//		question.setId(10001);
//		question.setqName("What is mapping? ");
//
////		 
////		 // Crate Answer ...............
//
//		Answer answer = new Answer();
//		answer.setId(2001);
//		answer.setqAnswer("Use an one-to-one mapping to represent simple pointer references between two Java objects.");
//		answer.setQuestion(question);
//
//		Answer answer2 = new Answer();
//		answer2.setId(2002);
//		answer2.setqAnswer("pointer references");
//		answer2.setQuestion(question);
//
////		 // list...
//
//		List<Answer> answers = new ArrayList<Answer>();
//
//		answers.add(answer);
//		answers.add(answer2);
//
//		question.setAnswers(answers);
//
//		answer.setQuestion(question);
//
//		session.save(question);
//
//		session.save(answer);
//		session.save(answer2);
//
//		tx.commit();

		// Fetch Data ........ by Question ...........

		Question question2 = (Question) session.get(Question.class, 10001);
		System.out.println(question2.getqName());

		for (Answer a : question2.getAnswers()) {
			System.out.println(a.getqAnswer());
		}

		factory.close();

	}

}
