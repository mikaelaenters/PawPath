    
package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.daos.UserDaoImpl;

@Component
public class UserServiceImpl implements UserService {
	
	private UserDaoImpl userDao;
	
	@Autowired
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public User getUserByUsername(String username) {
		return userDao.getUser(username);
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	@Override
	public void registerUser(User user) {
		userDao.saveUser(user);
	}

}