package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Dogs;
import com.revature.daos.DogDao;

@RestController
@CrossOrigin(origins="*")
public class DogController {
	
	DogDao dogDao;
	
	@Autowired
	public void setDogDao(DogDao dogDao) {
		this.dogDao = dogDao;
	}
	
	@PostMapping(consumes = "application/json", value = "/addDog")
	public String buyInsurance(@RequestBody Dogs dog) {
		dogDao.addDog(dog);
		return "success";
	}
	
    @GetMapping(value = "/deleteDog{dogId}")
	public void deleteDog(int dogId) {
		dogDao.deleteDog(dogId);
		
	}
    
    @GetMapping(value = "/dogs")
	public List<Dogs> seeAllPayments(Dogs dog) {
    	return dogDao.getAllDogs();
		
	}
	
	

}
