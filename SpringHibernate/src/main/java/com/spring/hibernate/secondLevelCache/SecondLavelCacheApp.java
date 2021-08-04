package com.spring.hibernate.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.spring.hibernate.SpringHibernate.Student;





public class SecondLavelCacheApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student student = session.get(Student.class, 1002);
		System.out.println(student.getName());
		System.out.println(student.getTraining().getTrainingName());
		session.close();
		
		System.err.println(" Checking Second level Cache ...........");
		
		Session session2 = factory.openSession();
		
		Student student2 = session2.get(Student.class, 1002);
		System.out.println(student2.getTraining().getTrainingName());
		System.out.println(student2.getName());
		
		session2.close();
		
	
		
		factory.close();
		
		// ............................... completed hibernate session..................................
		
	}

}
