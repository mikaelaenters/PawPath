package com.revature.service;

import java.util.List;

import com.revature.beans.Payroll;

public interface PayrollService {
	public List<Payroll> getAllPaychecks();
	public Payroll getPaycheckById(int id);
	public void createPaycheck(Payroll paycheck);
	}
