package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class UserDaoImpl implements UserDao {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public User getUserByUsername(String username) {
		Session session = sf.openSession();
		String hql = "FROM User as u WHERE u.username = :name";
		
		Query query = session.createQuery(hql);
		query.setString("name", username);
		
		User user = (User) query.uniqueResult();
		session.close();
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(User.class);
		
		List<User> allUsers = criteria.list();
		
		session.close();
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
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	@Override
	public User loginUser(String username, String password) {
		Session session = sf.openSession();
		String hql = "FROM User WHERE username = :name AND password = :pass";
		
		Query query = session.createQuery(hql);
		query.setString("name", username);
		query.setString("pass", password);
		
		User user = (User) query.uniqueResult();
		
		session.close();
		
		return user;
	}

}
