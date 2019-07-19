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
@Table(name="profiles")
public class Profile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private int profileId;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="credit_card")	
	private String creditCard;

	@Column(name="street_address")
	private String streetAddress;

	//This possibly could delete the entire user from the system if we delete a profile
	//Has not been tested/determined at the moment.
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User user;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="zipcode")
	private String zipCode;

	@Column(name="bio")
	private String bio;

	public Profile() {
		// TODO Auto-generated constructor stub
	}


	public Profile(int profileId, String phoneNumber, String creditCard, String streetAddress, User user, String city,
			String state, String zipCode, String bio) {
		super();
		this.profileId = profileId;
		this.phoneNumber = phoneNumber;
		this.creditCard = creditCard;
		this.streetAddress = streetAddress;
		this.user = user;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.bio = bio;
	}


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

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", phoneNumber=" + phoneNumber + ", creditCard=" + creditCard
				+ ", streetAddress=" + streetAddress + ", user=" + user + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", bio=" + bio + "]";
	}
}
