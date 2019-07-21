package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Walk;
import com.revature.util.SessionFactoryUtil;

public class WalkDaoImpl {
	
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	
	public List<Walk> getAllWalks() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Walk.class);
		List<Walk> allWalks = criteria.list();
		sf.close();
			
		return allWalks;
		
		
	}


	public void saveWalk(Walk walk) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(walk);
		transaction.commit();
		sf.close();
	}

	
	public Walk getWalkById(int id) {
		Session session = sf.openSession();
		Walk walk = session.get(entityType, id);
		session.close();
	}

	
	public void updateWalk(Walk walk) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteWalk(Walk walk) {
		// TODO Auto-generated method stub
		
	}

}
