package com.spring.hibernate.SpringHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		
		Student student = (Student) session.get(Student.class, 1003);
		
		System.out.println(student.toString());
		
		University university = (University) session.load(University.class, 1);
		System.out.println(university);
		
		session.close();
		factory.close();
		
		
	}

}
