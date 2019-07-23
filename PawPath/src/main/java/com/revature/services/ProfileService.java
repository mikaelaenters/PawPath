package com.revature.services;

import java.util.List;

import com.revature.beans.Profile;

public interface ProfileService {

	public Profile getProfileByUserId(int userId);
	public List<Profile> getAllProfiles();
	public void registerProfile(Profile profile);
	
}
