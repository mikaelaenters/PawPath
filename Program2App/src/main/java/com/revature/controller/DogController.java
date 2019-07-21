package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Dogs;
import com.revature.daos.DogDaoImpl;

@RestController("/dogs")
@CrossOrigin(origins="*")
public class DogController {
	
	DogDaoImpl dogDao;
	
	@Autowired
	public void setDogDao(DogDaoImpl dogDao) {
		this.dogDao = dogDao;
	}
	
	@PostMapping(consumes = "application/json")            //, value = "/addDog")
	public String addADog(@RequestBody Dogs dog) {
		dogDao.addDog(dog);
		return "success";
	}
	
    @GetMapping(value = "/dogs/deleteDog{dogId}")
	public void deleteDog(int dogId) {
		dogDao.deleteDog(dogId);
		
	}
    
    @GetMapping
	public List<Dogs> seeAllPayments(Dogs dog) {
    	return dogDao.getAllDogs();
		
	}
	
	

}
