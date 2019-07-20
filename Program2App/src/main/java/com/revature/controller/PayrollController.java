package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Payroll;
import com.revature.service.PayrollServiceImpl;


@RestController("/payroll")
@CrossOrigin(origins="*")
public class PayrollController {
	private PayrollServiceImpl payrollService;
	
	@Autowired
	public void setUserService(PayrollServiceImpl payrollService) {
		this.payrollService = payrollService;
	}
	@GetMapping
	public List<Payroll> getAllPaychecks() {
		return payrollService.getAllPaychecks();
	}
	@GetMapping("/payroll/{paycheck}")
	public Payroll getPaycheckById(@PathVariable int id) {
		return payrollService.getPaycheckById(id);
	}
	@PostMapping(consumes = "application/json")
	public String makePaycheck(@RequestBody Payroll paycheck) {
		payrollService.createPaycheck(paycheck);
		return "success";
	}
}
