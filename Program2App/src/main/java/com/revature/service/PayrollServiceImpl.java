package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Payroll;
import com.revature.daos.PayrollDao;
import com.revature.daos.PayrollDaoImpl;

@Component
public class PayrollServiceImpl implements PayrollService {
	private PayrollDaoImpl payrollDao;
	
	@Autowired
	public void setPayrollDao(PayrollDaoImpl payrollDao) {
		this.payrollDao = payrollDao;
	}

	@Override
	public List<Payroll> getAllPaychecks() {
		return payrollDao.getAllPaychecks();
	}

	@Override
	public Payroll getPaycheckById(int id) {
		return payrollDao.getPaycheckById(id);
	}

	@Override
	public void createPaycheck(Payroll paycheck) {
		payrollDao.savePaycheck(paycheck);
	}

}
