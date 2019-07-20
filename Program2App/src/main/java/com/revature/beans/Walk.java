package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="walks")
public class Walk {

	@Column(name="wid")
	private int walkId;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="dog_id")
	private Dogs dog;
	
	@Column(name="walk_date")
	private String walkDate;
	
	@Column(name="walk_time")
	private String walkTime;
	
	@Column(name="location_zip")
	private String locationZipcode;
	
	@Column(name="minutes")
	private double minutes;
	
	
	
}
