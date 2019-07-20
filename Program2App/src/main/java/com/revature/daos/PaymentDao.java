package com.revature.daos;

import java.util.List;

import com.revature.beans.Payments;
import com.revature.beans.User;

public interface PaymentDao {
	public User makePayment(User user, int id);
	public void submitPayment(Payments payment);
	public List<Payments> seeAllPayments();

}
