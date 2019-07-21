package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Payments;
import com.revature.beans.User;
import com.revature.daos.PaymentDaoImpl;


@RestController
@CrossOrigin(origins="*")
public class PaymentController {
	
	PaymentDaoImpl paymentDao;
	User user = null;
	
	@Autowired
	
	public void setPaymentDao(PaymentDaoImpl paymentDao) {
		this.paymentDao = paymentDao;
	}
	
    @GetMapping(value = "/payment{userId}")
	
	public User getUserById(@PathVariable int userId) {
		return paymentDao.makePayment(user, userId);
		
	}
	
    @GetMapping(value = "/seePayments")
	public List<Payments> seeAllPayments(Payments payments) {
    	return paymentDao.seeAllPayments();
		
	}
    
    @PostMapping(consumes = "application/json", value = "/submitPayment")
	public String buyInsurance(@RequestBody Payments payment) {
		paymentDao.submitPayment(payment);
		return "success";
	}

}
