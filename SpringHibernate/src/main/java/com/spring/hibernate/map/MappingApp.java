package com.spring.hibernate.map;

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
		 
		 // Crate Answer ...............
		 Question question ;
		 
		 Answer answer = new Answer();
		 answer.setId(2001);
		 answer.setqAnswer("Use an one-to-one mapping to represent simple pointer references between two Java objects.");
		 
		 
		 
		 // Create  a Question ..... 
		 
		 
		question = new Question(10001, "What is mapping? ", answer);
	
		 
		 
		 // Session .................
		 
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 answer.setQuestion(question);
		 
		 session.save(question);
		 session.save(answer);
		 
		 
		 
		 tx.commit();
		 
		 
		 // Featching Data .....................
		 
		 
		 System.out.println("\n\n"+session.get(Question.class, 10001)+"\n\n");
		 
		 Question question2 = (Question) session.get(Question.class, 10001);
		 System.out.println(question2.getqName());
		 System.out.println(question2.getAnswer().getqAnswer()); 

		 
		 
		 System.out.println("\n\n"+session.get(Answer.class, 2001)+"\n\n");
		 
		 Answer answer2 = (Answer) session.get(Answer.class, 2001);
		 System.out.println(answer2.getQuestion().getqName());
		 System.out.println(answer2.getqAnswer());
		 factory.close();
		
		

	}

}
