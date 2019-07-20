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
		
		String username = "mikaelaenters";
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction(); 
//		Query query = sess.createQuery("FROM " + User.class.getName() + " as u WHERE u.username = " + username);
//		
//		User user = (User) query.uniqueResult();
		
		User user = sess.get(User.class, 1);
		System.out.println(user);
		//sess.close();
		
		
//		Query query = sess.createQuery("FROM " + User.class.getName() + " as u WHERE u.username = " + username);
//		
//		User user = (User) query.uniqueResult();
		
	//	Profile profile = new Profile(-1, "3012522365", "56545645", "1600 penn", user, "Tampa", "FL", "33612", "u suck");
	//	sess.save(profile);
		tx.commit();
		
	//	System.out.println(profile);
		sess.close();
		
	}
}
