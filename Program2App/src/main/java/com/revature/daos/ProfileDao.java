package com.revature.daos;

import java.util.List;

import com.revature.beans.Profile;


public interface ProfileDao {

	//C for create
	public void insertProfile(Profile p);
	
	//R for read
	public Profile getProfileById(int id);
	
	public List<Profile> getAllProfiles();
	
	//U for update
	public void updateProfile(Profile p);
	
	//D for delete
	public void deleteProfile(Profile p);
	

}