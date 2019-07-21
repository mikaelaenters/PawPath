package com.revature.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

public class UserDaoImpl implements UserDao {
	
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public User getUser(String username) {
		
		Session session = sf.openSession();
			String hql = "FROM Users as u WHERE u.username = :name";
			
			Query query = session.createQuery(hql);
			
			query.setString("name", username);
			
			User user = (User) query.uniqueResult();
		
		session.close();
		
		return user;
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}