package com.spring.hibernate.mtm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MtoMmappingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setE_id(1001);
		e1.setE_name("Azmin");
		e2.setE_id(1002);
		e2.setE_name("Habib");
		
		
		Projects p1 = new Projects();
		Projects p2 = new Projects();
		
		p1.setP_id(1001);
		p1.setProjectName("eCommerce");
		p2.setP_id(1002);
		p2.setProjectName("POS");
		
		
		List<Employee> elList = new ArrayList<Employee>();
	
		List<Projects> pList = new ArrayList<Projects>();
		
		elList.add(e2);
		elList.add(e1);
		
		pList.add(p1);
		pList.add(p2);
		
		e1.setPorjects(pList);
		p2.setEmployees(elList);
		p1.setEmployees(elList);
		e2.setPorjects(pList);
		
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		session.save(e1);
		session.save(e2);
		
		session.save(p1);
		session.save(p2);
		
		
		
		
		
		tx.commit();
		factory.close();
		

	}

}
