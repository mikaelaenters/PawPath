package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="insurance_id")
	private int insurance_id;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="opt_out")
	private boolean opt_out;
	
	@Column(name="liability")
	private boolean liability;
	
	@Column(name="comprehensive")
	private boolean comprehensive;
	
	@Column(name="price")
	private double price;
	public Insurance() {
		
	}
	public Insurance(int insurance_id, User user, boolean opt_out, boolean liability, boolean comprehensive,
			double price) {
		super();
		this.insurance_id = insurance_id;
		this.user = user;
		this.opt_out = opt_out;
		this.liability = liability;
		this.comprehensive = comprehensive;
		this.price = price;
	}
	public synchronized int getInsurance_id() {
		return insurance_id;
	}
	public synchronized void setInsurance_id(int insurance_id) {
		this.insurance_id = insurance_id;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public synchronized boolean isOpt_out() {
		return opt_out;
	}
	public synchronized void setOpt_out(boolean opt_out) {
		this.opt_out = opt_out;
	}
	public synchronized boolean isLiability() {
		return liability;
	}
	public synchronized void setLiability(boolean liability) {
		this.liability = liability;
	}
	public synchronized boolean isComprehensive() {
		return comprehensive;
	}
	public synchronized void setComprehensive(boolean comprehensive) {
		this.comprehensive = comprehensive;
	}
	public synchronized double getPrice() {
		return price;
	}
	public synchronized void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
