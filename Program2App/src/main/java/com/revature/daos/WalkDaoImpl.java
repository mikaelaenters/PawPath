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
  
public class WalkDaoImpl implements WalkDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public List<Walk> getAllWalks() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Walk.class);
		List<Walk> allWalks = criteria.list();
		sf.close();
			
		return allWalks;
	}
}

	@Override
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

	@Override
	public Walk getWalkById(int id) {
		Session session = sf.openSession();
		Walk walk = session.get(entityType, id)
		Walk walk = session.get(Walk.class, id);
		session.close();
		return walk;
	}

	@Override
	public void updateWalk(Walk walk) {
		// TODO Auto-generated method stub
		
	}
  
	@Override
	public void deleteWalk(Walk walk) {
		// TODO Auto-generated method stub
		
	}
}
