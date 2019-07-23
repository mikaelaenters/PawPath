package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="walks")
public class Walk {
	
	//Fields;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wid")
	private int walkId;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User walkingContractor;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="dog_id")
	private Dog walkedDog;
	
	@Column(name="walk_date")
	private String walkDate;
	
	@Column(name="walk_time")
	private String walkTime;
	
	@Column(name="location_zip")
	private String locationZipcode;
	
	@Column(name="minutes")
	private double minutes;

	//Constructors;
	public Walk() {
		
	}
	
	public Walk(int walkId, User walkingContractor, Dog walkedDog, String walkDate, String walkTime,
			String locationZipcode, double minutes) {
		super();
		this.walkId = walkId;
		this.walkingContractor = walkingContractor;
		this.walkedDog = walkedDog;
		this.walkDate = walkDate;
		this.walkTime = walkTime;
		this.locationZipcode = locationZipcode;
		this.minutes = minutes;
	}

	//Getters &Setters;
	public int getWalkId() {
		return walkId;
	}

	public void setWalkId(int walkId) {
		this.walkId = walkId;
	}

	public User getWalkingContractor() {
		return walkingContractor;
	}

	@Autowired
	public void setWalkingContractor(User walkingContractor) {
		this.walkingContractor = walkingContractor;
	}

	public Dog getWalkedDog() {
		return walkedDog;
	}

	@Autowired
	public void setWalkedDog(Dog walkedDog) {
		this.walkedDog = walkedDog;
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
}
