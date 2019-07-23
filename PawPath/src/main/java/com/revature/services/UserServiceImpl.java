package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.daos.UserDao;

@Component
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public User loginUser(String username, String password) {
		return userDao.loginUser(username, password);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
		
	}

	@Override
	public void registerUser(User user) {
		userDao.saveUser(user);

	}

}
