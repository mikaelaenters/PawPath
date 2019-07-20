package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.beans.Profile;
import com.revature.util.SessionFactoryUtil;

@Component
public class ProfileDaoImpl implements ProfileDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public ProfileDaoImpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Profile getProfileByUserId(int userId) {
		Session session = sf.openSession();
		//This User is the class/object -----NOT TABLE-------
			String hql = "FROM Profile WHERE userId = :id";
			Query query = session.createQuery(hql);//, User.class);
			query.setParameter("id", userId);
			Profile profile = (Profile) query.getSingleResult();
		session.close();
		return profile;
	}

	@Override
	public List<Profile> getAllProfiles() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Profile.class);
	//	Criteria crit = sess.createCriteria(Profile);
		List<Profile> result = crit.list();
		sess.close();
		return result;
	}

	@Override
	public void updateProfile(Profile p) {
		// TODO Auto-generated method stub
	}
	@Override
	public void deleteProfile(Profile p) {
		// TODO Auto-generated method stub
	}

	@Override
	public void saveProfile(Profile profile) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(profile);
		transaction.commit();
		sf.close();
		
	}

}
