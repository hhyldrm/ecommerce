package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {

	public static void main(String[] args) {
		
		Student04 std = new Student04();
		Book04 book = new Book04();
		
		Configuration con =  new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student04.class).addAnnotatedClass(Book04.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session  = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String sqlQuery = "DELETE FROM Student04";
		
//		int numberOfRowsDeleted = session.createSQLQuery(sqlQuery).executeUpdate();
//		System.out.println(numberOfRowsDeleted + " records have been deleted");
		
		book = session.get(Book04.class, 10);
		
		session.delete(book);
		
		
		
		
		
		
		
		tx.commit();
		
		
		
		
	}

}
