package com.revature.driver;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

public class Driver {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	
	public static void main(String[] args) {
		
		String username = "mikaelaenters";
		
		Session sess = sf.openSession();
//		Query query = sess.createQuery("FROM " + User.class.getName() + " as u WHERE u.username = " + username);
//		
//		User user = (User) query.uniqueResult();
		
		User user = sess.get(User.class, 1);
		System.out.println(user);
		sess.close();
		
		
	}
}
