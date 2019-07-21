package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
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

	public int getWalkId() {
		return walkId;
	}

	public void setWalkId(int walkId) {
		this.walkId = walkId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dogs getDog() {
		return dog;
	}

	public void setDog(Dogs dog) {
		this.dog = dog;
	}

	public String getWalkDate() {
		return walkDate;
	}

	public void setWalkDate(String walkDate) {
		this.walkDate = walkDate;
	}

	public String getWalkTime() {
		return walkTime;
	}

	public void setWalkTime(String walkTime) {
		this.walkTime = walkTime;
	}

	public String getLocationZipcode() {
		return locationZipcode;
	}

	public void setLocationZipcode(String locationZipcode) {
		this.locationZipcode = locationZipcode;
	}

	public double getMinutes() {
		return minutes;
	}

	public void setMinutes(double minutes) {
		this.minutes = minutes;
	}

	public Walk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Walk(int walkId, User user, Dogs dog, String walkDate, String walkTime, String locationZipcode,
			double minutes) {
		super();
		this.walkId = walkId;
		this.user = user;
		this.dog = dog;
		this.walkDate = walkDate;
		this.walkTime = walkTime;
		this.locationZipcode = locationZipcode;
		this.minutes = minutes;
	}
	
	
	
	
	
}
