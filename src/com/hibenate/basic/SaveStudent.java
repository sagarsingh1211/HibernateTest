package com.hibenate.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		StudentPojo sp = new StudentPojo();

		// p.setId(1);
		sp.setName("ABC");
		sp.setMobile(1444456724);

		StudentPojo sp1 = new StudentPojo();

		// p1.setId(103);
		sp1.setName("ABCD");
		sp1.setMobile(1444346724);

		StudentPojo sp2 = new StudentPojo();

		// p2.setId(104);
		sp2.setName("ABCDD");
		sp2.setMobile(1454456724);

		StudentPojo sp3 = new StudentPojo();

		// p3.setId(105);
		sp3.setName("ABCDS");
		sp3.setMobile(1448456724);

		StudentAddress sa = new StudentAddress();
		sa.setCity("bangalore");
		sa.setCountry("india");
		sa.setPin(234);

		StudentAddress sa3 = new StudentAddress();
		sa3.setCity("bangalore");
		sa3.setCountry("india");
		sa3.setPin(234);

		StudentAddress sa1 = new StudentAddress();
		sa1.setCity("delhi");
		sa1.setCountry("india");
		sa1.setPin(2342);

		StudentAddress sa2 = new StudentAddress();
		sa2.setCity("mumbai");
		sa2.setCountry("india");
		sa2.setPin(23432);

		Transaction tx = session.beginTransaction();
		/*
		 * session.save(p); session.save(p1); session.save(p2);
		 * session.save(p3);
		 * 
		 * session.save(sa); session.save(sa1); session.save(sa2);
		 * session.save(sa3);
		 */

		sp.setStudentAddress(sa);
		sp1.setStudentAddress(sa1);
		sp2.setStudentAddress(sa2);
		sp3.setStudentAddress(sa3);

		session.save(sp);
		session.save(sp1);
		session.save(sp2);
		session.save(sp3);

		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}
