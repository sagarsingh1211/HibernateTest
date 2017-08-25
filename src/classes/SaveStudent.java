package classes;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudent {

	public static void main(String[] args)
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		StudentPojo p=new StudentPojo();
 
		//p.setId(1);
		p.setName("ABC");
		p.setMobile(1444456724);
		
		StudentPojo p1=new StudentPojo();
		 
		//p1.setId(103);
		p1.setName("ABCD");
		p1.setMobile(1444346724);
		
		StudentPojo p2=new StudentPojo();
		 
		//p2.setId(104);
		p2.setName("ABCDD");
		p2.setMobile(1454456724);
		
		StudentPojo p3=new StudentPojo();
		 
		//p3.setId(105);
		p3.setName("ABCDS");
		p3.setMobile(1448456724);
 
		Transaction tx = session.beginTransaction();
		session.save(p);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}
