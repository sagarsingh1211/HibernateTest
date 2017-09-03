package com.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Courses.class);
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s = new Student();
		s.setMobile(1234);
		s.setName("Hari");

		Student s1 = new Student();
		s1.setMobile(1233);
		s1.setName("Babu");

		Courses c1 = new Courses();
		c1.setCoursename("Math");

		Courses c2 = new Courses();
		c2.setCoursename("Hindi");

		Courses c3 = new Courses();
		c3.setCoursename("English");

		s.getCourse().add(c1);
		s.getCourse().add(c3);
		s.getCourse().add(c3);
		s1.getCourse().add(c2);
		s1.getCourse().add(c3);

		session.save(s);
		session.save(s1);
		session.save(c1);
		session.save(c2);
		session.save(c3);

		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}

}
