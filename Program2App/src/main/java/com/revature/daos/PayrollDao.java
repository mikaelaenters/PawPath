package com.revature.daos;

import java.util.List;

import com.revature.beans.Payroll;

public interface PayrollDao {
	//the entries in payroll function as paychecks, so I chose this name, it felt weird to add payrolls to Payroll
	public List<Payroll> getAllPaychecks();
	public void savePaycheck(Payroll paycheck);
	public Payroll getPaycheckById(int id);
	public Payroll getPaycheckByContractorId(int id);
	public Payroll getPaycheckByJobId(int id);
	public void updatePaycheck(Payroll paycheck);
	public void deletePaycheck(int id);
}
