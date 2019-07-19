package com.revature.daos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.User;

@Component
public interface UserDao {
	
	public User getUser(String username);
	public List<User> getAllUsers();
	public void saveUser(User user);
	public User getUserById(int id);
}
