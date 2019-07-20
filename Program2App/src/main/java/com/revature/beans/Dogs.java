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
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="dogs")
public class Dogs {
	
	@Id
	@Column(name="dog_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dog_id;
	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="owner_id")
	private int owner_id;
	
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="dog_size")
	private String dog_size;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dog_age")
	private double dog_age;
	
	public Dogs() {
		super();
		
	}

	public synchronized int getDog_id() {
		return dog_id;
	}

	public synchronized void setDog_id(int dog_id) {
		this.dog_id = dog_id;
	}


	public synchronized String getFullname() {
		return fullname;
	}

	public synchronized void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public synchronized String getBreed() {
		return breed;
	}

	public synchronized void setBreed(String breed) {
		this.breed = breed;
	}

	public synchronized String getDog_size() {
		return dog_size;
	}

	public synchronized void setDog_size(String dog_size) {
		this.dog_size = dog_size;
	}

	public synchronized String getGender() {
		return gender;
	}

	public synchronized void setGender(String gender) {
		this.gender = gender;
	}

	public synchronized double getDog_age() {
		return dog_age;
	}

	public synchronized void setDog_age(double dog_age) {
		this.dog_age = dog_age;
	}

	public Dogs(int dog_id, int owner_id, String fullname, String breed, String dog_size, String gender,
			double dog_age) {
		super();
		this.dog_id = dog_id;
		this.owner_id = owner_id;
		this.fullname = fullname;
		this.breed = breed;
		this.dog_size = dog_size;
		this.gender = gender;
		this.dog_age = dog_age;
	}


}
