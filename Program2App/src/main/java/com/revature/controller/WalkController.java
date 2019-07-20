package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/walk")
@CrossOrigin(origins="*")
public class WalkController {
		
//		private UserServiceImpl userService;
//		
//		@Autowired
//		public void setUserService(UserServiceImpl userService) {
//			this.userService = userService;
//		}
//		
//		@GetMapping
//		public List<User> getAllUsers() {
//			return userService.getAllUsers();
//		}
//		
//		@GetMapping("/user/{username}")
//		public User getUserByUsername(@PathVariable String username) {
//			return userService.getUserByUsername(username);
//			
//		}
//		
//		@PostMapping(consumes = "application/json")
//		public String makeUser(@RequestBody User user) {
//			userService.registerUser(user);
//			return "success";
//		}
//	}
}
