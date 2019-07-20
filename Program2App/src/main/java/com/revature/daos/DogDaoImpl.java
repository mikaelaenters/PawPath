package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Dogs;
import com.revature.util.SessionFactoryUtil;

@Component
public class DogDaoImpl implements DogDao {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@SuppressWarnings("deprecation")
	
	@Override
	public List<Dogs> getAllDogs(){
		
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Dogs.class);
		@SuppressWarnings("unchecked")
		List<Dogs> result = crit.list();
		sess.close();
		return result;
		
	}
	
	@Override
	public void addDog(Dogs dog) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(dog);
		tx.commit();
		sess.close();
	}
	
	@Override
	public void deleteDog(int id) {
		Session sess = sf.openSession();
	    Dogs dog = sess.get(Dogs.class, id);
	    sess.delete(dog);
		sess.close();
	}

}
