package in.pwskills.nitin.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pwskills.nitin.entity.Employee;

public class TestApp {

	public static void main(String[] args) {
		 
		//Activate the HIBERNATE software
		Configuration configuration=new Configuration();
		
		//load hibernate.cfg.xml file into configuration object
		configuration.configure();
		
		//Build sessionFactory object using configuration object
		//[load driver, establish connection, create PreparedStatement]
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//To perform operation(task) create one session object using sessionFactory
		Session session=sessionFactory.openSession();
		
		//Begin the transaction w.r.t particular session
		Transaction transaction= session.beginTransaction();
		
		//Perform update operation
		Employee emp= new Employee();
		emp.setId(10);
		emp.setName("Messi");
		emp.setAge(44);
		emp.setAddress("Argentine");
		
		session.saveOrUpdate(emp);
	
		//Commit the operation
		transaction.commit();
		
		//Close the session
		session.close();
	}

}
