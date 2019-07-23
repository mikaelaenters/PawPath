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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="profiles")
public class Profile {
	
	//Fields;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private int profileId;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="credit_card")
	private String creditCard;
	
	@Column(name="street_adress")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zipcode")
	private String zipCode;
	
	@Column(name="bio")
	private String bio;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;

	//Constructors;
	public Profile() {
		
	}
	
	public Profile(int profileId, String phoneNumber, String creditCard, String address, String city, String state,
			String zipCode, String bio, User user) {
		super();
		this.profileId = profileId;
		this.phoneNumber = phoneNumber;
		this.creditCard = creditCard;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.bio = bio;
		this.user = user;
	}

	//Getters &Setters;
	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public User getUser() {
		return user;
	}

	@Autowired
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
