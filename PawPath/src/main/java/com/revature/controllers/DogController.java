package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Dog;
import com.revature.beans.User;
import com.revature.services.DogService;

@RestController("/dog")
@CrossOrigin(origins="*")
public class DogController {

	private DogService dogService;
	
	
	@Autowired
	public void setDogService(DogService dogService) {
		this.dogService = dogService;
	}
	

	
	
//	@GetMapping("/dog/")
//	public User getUserByUsername(@PathVariable ) {
//		
//		
//	}
	
	@PostMapping(value = "/dog", consumes = "application/json")
	public String addADog(@RequestBody Dog dog) {
		System.out.println(dog);
		dogService.createDog(dog);
		return "success";
	}

}
