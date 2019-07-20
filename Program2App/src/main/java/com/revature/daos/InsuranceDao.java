package com.revature.daos;

import com.revature.beans.Insurance;
import com.revature.beans.User;

public interface InsuranceDao {
	
	public User applyForInsurance(User user, int id);
	public void buyInsurance(Insurance insurance);

}
