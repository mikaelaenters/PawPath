package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.User;

@Component
public interface UserService {
	
	public User getUserByUsername(String username);
	public List<User> getAllUsers();
	public void registerUser(User user);
}
