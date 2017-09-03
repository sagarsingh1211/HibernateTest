package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(StudentAddress.class);
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student s=new Student();
		
		s.setMobile(1234);
		s.setName("Ram");
		
		Student s1=new Student();
		
		s1.setMobile(1233);
		s1.setName("Shyam");
		
		StudentAddress sa=new StudentAddress();
		sa.setCity("Bangalore");
		sa.setCountry("India");
		sa.setPin(123456);
		
		StudentAddress sa1=new StudentAddress();
		sa1.setCity("Delhi");
		sa1.setCountry("India");
		sa1.setPin(1233321);
		
		Transaction tx = session.beginTransaction();
		s.setStudentAddress(sa);
		s1.setStudentAddress(sa1);
		
		session.save(s);
		session.save(s1);
		
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}

}
