package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Insurance;
import com.revature.beans.Payments;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;


public class PaymentDaoImpl implements PaymentDao {
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	

//	@Override
//	public User makePayment(User user, int id) {
//		Session sess = sf.openSession();
//		user = sess.get(User.class, id);
//		sess.close();
//		
//		return user;
//
//	}

	@Override
	public List<Payments> seeAllPayments() {
		Session sess = sf.openSession();
		@SuppressWarnings("deprecation")
		Criteria crit = sess.createCriteria(Payments.class);
		@SuppressWarnings("unchecked")
		List<Payments> result = crit.list();
		sess.close();
		return result;
	}
	
    public void submitPayment(Payments payment) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(payment);
		tx.commit();
		sess.clear();
		

	}

}
