package com.spring.hibernate.firstLavelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.SpringHibernate.Student;
import com.spring.hibernate.otm.Answer;
import com.spring.hibernate.otm.Question;

public class FirstCacheApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student student = session.get(Student.class, 1002);
		
		System.out.println(student.getName());
		
		System.err.println(" Checking First level Cache ...........");
		
		System.out.println(student.getTraining().getTrainingName());
		
	
		session.close();
		factory.close();
		

	}

}
