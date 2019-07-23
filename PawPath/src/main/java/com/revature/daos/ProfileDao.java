package com.revature.daos;

import java.util.List;

import com.revature.beans.Profile;

public interface ProfileDao {
	
	//C for create
	public void saveProfile(Profile profile);
	//R for read
	public Profile getProfileByUserId(int userId);
	public List<Profile> getAllProfiles();
	//U for update
	public void updateProfile(Profile p);
	//D for delete
	public void deleteProfile(Profile p);
		
}
