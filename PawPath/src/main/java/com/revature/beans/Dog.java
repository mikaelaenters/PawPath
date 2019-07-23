package com.revature.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="dogs")
public class Dog {
	
	//Fields;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dog_id")
	private int dogId;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="owner_id")
	private User owner;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="dog_size")
	private String dogSize;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dog_age")
	private int dogAge;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="walkedDog")
	List<Walk> walks = new ArrayList<Walk>();
	
	//Constructors;
	public Dog() {
		
	}
	
	public Dog(int dogId, User owner, String fullname, String breed, String dogSize, String gender, int dogAge) {
		super();
		this.dogId = dogId;
		this.owner = owner;
		this.fullname = fullname;
		this.breed = breed;
		this.dogSize = dogSize;
		this.gender = gender;
		this.dogAge = dogAge;
	}

	//Getters &Setters;
	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDogSize() {
		return dogSize;
	}

	public void setDogSize(String dogSize) {
		this.dogSize = dogSize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public User getOwner() {
		return owner;
	}

	@Autowired
	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<Walk> getWalks() {
		return walks;
	}

	public void setWalks(List<Walk> walks) {
		this.walks = walks;
	}
	

}
