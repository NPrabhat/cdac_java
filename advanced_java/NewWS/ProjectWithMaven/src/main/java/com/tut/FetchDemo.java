package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String [] args) {
		//get() , load()
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get id=102
		 Student student = (Student)session.get(Student.class, 102);
		 System.out.println(student);
		 
		 //get Address
		 Address address = (Address)session.get(Address.class,1);
		
		session.close();
		factory.close();
		
	}
}
