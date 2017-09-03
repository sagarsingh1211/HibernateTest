import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.inharitance.Module;
import com.hibernate.inharitance.Project;
import com.hibernate.inharitance.Task;


public class SaveModule {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Project.class);
		cfg.addAnnotatedClass(Module.class);
		cfg.addAnnotatedClass(Task.class);
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Project p =new Project();
		p.setProjectName("Hibernate Study");
		
		Module m =new Module();
		m.setModuleName("Basics");
		m.setProjectName("Module project");
		
		Task t=new Task();
		t.setTaskName("Inharitance mapping");
		t.setModuleName("Task Module");
		t.setProjectName("MOdule task project");
		
		session.save(t);
		session.save(p);
		session.save(m);
		
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();

	}

}
