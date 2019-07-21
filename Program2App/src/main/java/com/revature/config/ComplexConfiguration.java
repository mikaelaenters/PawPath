package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.User;

@Configuration
public class ComplexConfiguration {
	
	@Bean()
	@Scope("prototype")
	public User user() {
		return new User();
	}
	
	
}
