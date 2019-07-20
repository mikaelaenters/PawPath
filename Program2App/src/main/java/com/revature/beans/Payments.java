package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Payments {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pay_id;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="membership")
	private String membership;
	
	@Column(name="chagre_date")
	private String charge_date;
	
	@Column(name="insurance_fee")
	private double insurance_fee;
	
	@Column(name="service_fee")
	private double service_fee;
	
	@Column(name="walk_fee")
	private double walk_fee;
	public Payments(int pay_id, int user_id, String membership, String charge_date, double insurance_fee,
			double service_fee, double walk_fee) {
		super();
		this.pay_id = pay_id;
		this.user_id = user_id;
		this.membership = membership;
		this.charge_date = charge_date;
		this.insurance_fee = insurance_fee;
		this.service_fee = service_fee;
		this.walk_fee = walk_fee;
	}
	public Payments() {
		super();
	}
	public synchronized int getPay_id() {
		return pay_id;
	}
	public synchronized void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}
	public synchronized int getUser_id() {
		return user_id;
	}
	public synchronized void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public synchronized String getMembership() {
		return membership;
	}
	public synchronized void setMembership(String membership) {
		this.membership = membership;
	}
	public synchronized String getCharge_date() {
		return charge_date;
	}
	public synchronized void setCharge_date(String charge_date) {
		this.charge_date = charge_date;
	}
	public synchronized double getInsurance_fee() {
		return insurance_fee;
	}
	public synchronized void setInsurance_fee(double insurance_fee) {
		this.insurance_fee = insurance_fee;
	}
	public synchronized double getService_fee() {
		return service_fee;
	}
	public synchronized void setService_fee(double service_fee) {
		this.service_fee = service_fee;
	}
	public synchronized double getWalk_fee() {
		return walk_fee;
	}
	public synchronized void setWalk_fee(double walk_fee) {
		this.walk_fee = walk_fee;
	}
	

}