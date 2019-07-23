package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Profile;
import com.revature.daos.ProfileDao;

@Component
public class ProfileServiceImpl implements ProfileService {

	private ProfileDao profileDao;
	
	@Autowired
	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}


	@Override
	public Profile getProfileByUserId(int userId) {
		
		return profileDao.getProfileByUserId(userId);
	}

	
	@Override
	public List<Profile> getAllProfiles() {
		
		return profileDao.getAllProfiles();
	}

	
	
	@Override
	public void registerProfile(Profile profile) {

		profileDao.saveProfile(profile);

	}

}
