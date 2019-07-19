package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	//Fields;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_role")
	private String userRole;
	
	@Column(name="fullname")
	private String fullname;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="user")
	private Profile userProfile;

	//Constructors;
	public User() {
		super();	
	}
	
	public User(int userId, String username, String password, String userRole, String fullname, Profile userProfile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
		this.fullname = fullname;
		//this.userProfile = userProfile;
	}

	//Getters &Setters;
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

//	public Profile getUserProfile() {
//		return userProfile;
//	}
//
//	public void setUserProfile(Profile userProfile) {
//		this.userProfile = userProfile;
//	}

	



	
}
