package com.revature.daos;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.beans.Walk;
import com.revature.util.SessionFactoryUtil;

@Component
public class WalkDaoImpl implements WalkDao {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public List<Walk> getAllContractorWalks(User user) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Walk.class).add(eq("user_id", user.getUserId()));
		
		List<Walk> allWalks = criteria.list();
		
		session.close();
		return allWalks;
	}

	@Override
	public void saveWalk(Walk walk) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(walk);
		transaction.commit();
		sf.close();
	}

	@Override
	public Walk getWalkById(int id) {
		Session session = sf.openSession();
		Walk walk = (Walk) session.get(Walk.class, id);
		session.close();
		return walk;
	}


	@Override
	public void updateWalk(Walk walk) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(walk);
		
		transaction.commit();
		session.close();
	}

	@Override
	public void deleteWalk(Walk walk) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(walk);
		
		transaction.commit();
		session.close();

	}

}
