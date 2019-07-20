package com.revature.beans;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="contractor_id")
	private int contractorId;
	
	//FK wid
	@Column(name="job")
	private int job;
	
	@Column(name="payrate")
	private int payrate;
	
}
