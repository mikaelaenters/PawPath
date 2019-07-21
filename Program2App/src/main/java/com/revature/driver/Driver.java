package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Profile;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

public class Driver {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	
	public static void main(String[] args) {
		
		Session sess = sf.openSession();
		Transaction t = sess.beginTransaction();	
//		User user = new User(1, "mikaelaenters", "hello", "contractor", "Mikaela Enters");
//		System.out.println(user);
//		sess.save(user);
		t.commit();
		sess.close();
		
		
	}
}
