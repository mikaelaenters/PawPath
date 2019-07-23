package com.revature.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.revature.beans.Dog;
import com.revature.beans.Profile;
import com.revature.beans.Review;
import com.revature.beans.User;
import com.revature.beans.Walk;


@Lazy
@Configuration
public class ComplexConfiguration {
	
	@Bean()
	@Scope("prototype")
	public User user() {
		return new User();
	}
	@Bean()
	@Scope("prototype")
	public Walk walk() {
		return new Walk();
	}
	@Bean()
	@Scope("prototype")
	public Profile profile() {
		return new Profile();
	}
	
	@Bean()
	@Scope("prototype")
	public Dog dog() {
		return new Dog();
	}
	@Bean()
	@Scope("prototype")
	public Review review() {
		return new Review();
	}
}
