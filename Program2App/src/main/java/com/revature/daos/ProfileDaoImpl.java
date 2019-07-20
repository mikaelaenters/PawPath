package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.Profile;
import com.revature.util.SessionFactoryUtil;

public class ProfileDaoImpl implements ProfileDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public ProfileDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertProfile(Profile p) {
		// TODO Auto-generated method stub

	}

	@Override
	public Profile getProfileById(int id) {
		// TODO Auto-generated method stub
		return null;
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

}
