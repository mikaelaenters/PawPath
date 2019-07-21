package com.revature.beans;

import java.sql.Timestamp;

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
@Table(name = "PAYROLL")
public class Payroll {

	// PK
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="paydate")
	private Timestamp paydate;
	
	//FK user_id
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User user;
	
	//FK wid
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="wid")
	private Walk walk;
	
	@Column(name="payrate")
	private int payrate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getPaydate() {
		return paydate;
	}

	public void setPaydate(Timestamp paydate) {
		this.paydate = paydate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Walk getWalk() {
		return walk;
	}

	public void setWalk(Walk walk) {
		this.walk = walk;
	}

	public int getPayrate() {
		return payrate;
	}

	public void setPayrate(int payrate) {
		this.payrate = payrate;
	}

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int id, Timestamp paydate, User user, Walk walk, int payrate) {
		super();
		this.id = id;
		this.paydate = paydate;
		this.user = user;
		this.walk = walk;
		this.payrate = payrate;
	}
	
	
	
}
