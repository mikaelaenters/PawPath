package com.revature.services;

import com.revature.beans.User;

public interface UserService {

	public User loginUser(String username, String password);
	public User getUserByUsername(String username);
	public void registerUser(User user);
	
}
