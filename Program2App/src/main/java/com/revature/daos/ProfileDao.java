package com.revature.daos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.Profile;


@Component
public interface ProfileDao {

	
	//unused methods
	//U for update
	public void updateProfile(Profile p);
	//D for delete
	public void deleteProfile(Profile p);
	
	
	
	//R for read
	public Profile getProfileByUserId(int userId);
	
	public List<Profile> getAllProfiles();
	//C for create
	public void saveProfile(Profile profile);
	

}