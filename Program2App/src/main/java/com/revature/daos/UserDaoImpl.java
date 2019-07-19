package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class UserDaoImpl implements UserDao {
	
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public User getUser(String username) {
		
		Session session = sf.openSession();
		//This User is the class/object -----NOT TABLE-------
			String hql = "FROM User WHERE username = :name";
			
			Query query = session.createQuery(hql);//, User.class);
			
			query.setParameter("name", username);
			
			User user = (User) query.getSingleResult();
		
		session.close();
		
		return user;
		
	}

	@Override
	public List<User> getAllUsers() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> allUsers = criteria.list();
		sf.close();
		
		return allUsers;
	}

	@Override
	public void saveUser(User user) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		sf.close();

	}

	@Override
	public User getUserById(int id) {
		Session session = sf.openSession();
	
		User user = session.get(User.class, id);
	
		sf.close();
		
		return user;
	}

}
