package com.spring.hibernate.SpringHibernate;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
     
        
//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//      System.out.println(sessionFactory);
//      System.out.println(sessionFactory.isClosed());
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
      
      Session session = factory.openSession();
//      session.beginTransaction();
      Transaction transaction = session.beginTransaction();
       
      // add new student ....
      
//      Student student = new Student(1003, "Jannat","Chemistry" );
      
      Student student = new Student();
      
      Training training = new Training(1001, "Advanced Java", "Shaid Azmin");
      
      student.setId(1002);
      student.setName("Afnann");
      student.setDep("Chemistry");
      student.setTraining(training);
      
      session.save(student);
       
//      University university = new University();
//      
//      university.setName("RUD");
//      university.setAddress("Bonani");
//      university.setIsOpen("Yes");
//      university.setFounder("Dr. Mustofa");
//      university.setCurrentDate(new Date());
//      university.setImage("https://www.at-languagesolutions.com/wp-content/uploads/2016/06/http-1.jpg");
//      
//      session.save(university);
//      System.out.println(university.toString());
      
      
//    session.getTransaction().commit();

    transaction.commit();
    session.close();
        
        
    }
}
