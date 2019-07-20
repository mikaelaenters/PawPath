package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Insurance;
import com.revature.beans.User;
import com.revature.daos.InsuranceDao;

@RestController
@CrossOrigin(origins="*")
public class InsuranceController {
	
	InsuranceDao insuranceDao;
	User user = null;
	
	@Autowired
	public void setInsuranceDao(InsuranceDao insuranceDao) {
		this.insuranceDao = insuranceDao;
	}
	
	@GetMapping(value = "/applyInsurance{userId}")
	
	public User getUserById(@PathVariable int userId) {
		return insuranceDao.applyForInsurance(user, userId);
		
	}
	
	@PostMapping(consumes = "application/json", value = "/buyInsurance")
	public String buyInsurance(@RequestBody Insurance insurance) {
		insuranceDao.buyInsurance(insurance);
		return "success";
	}
	

}
