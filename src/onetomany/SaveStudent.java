package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SaveStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(College.class);
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s=new Student();
		s.setName("Aaaam");
		s.setMobile(1234);
		
		Student s1=new Student();
		s1.setName("Baam");
		s1.setMobile(1233);
		
		College college= new College();
		college.setCollegeName("LPU");

		s.setCollege(college);
		s1.setCollege(college);
		
		session.save(college);
		session.save(s);
		session.save(s1);
		
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		
		
	}

}
