package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.services.UserService;

@RestController("/user")
@CrossOrigin(origins="*")
public class UserController {
	
	private UserService userService;
	
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@GetMapping
	public String testUser() {
		return "Test Successful!";
	}
	
	
	@GetMapping("/user/{username}/{password}")
	public User getUserByUsername(@PathVariable String username, @PathVariable String password) {
		
		User user = userService.loginUser(username, password);
		if(user != null) {
			System.out.println("Success!");
		}
		
		return user;
	}
	
	@PostMapping(consumes = "application/json")
	public String makeUser(@RequestBody User user) {
		userService.registerUser(user);
		return "success";
	}
}
