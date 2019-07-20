package com.revature.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Insurance;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class InsuranceDaoImpl implements InsuranceDao {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public void buyInsurance(Insurance insurance) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(insurance);
		tx.commit();
		sess.clear();
		

	}

	@Override
	public User applyForInsurance(User user, int id) {
		
		Session sess = sf.openSession();
		user = sess.get(User.class, id);
		sess.close();
		
		return user;
	}

}
