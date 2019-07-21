package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Profile;
import com.revature.daos.ProfileDaoImpl;

@Component
public class ProfileServiceImpl implements ProfileService {
	
	private ProfileDaoImpl profileDao;
	
	
	

	@Autowired
	public void setProfileDao(ProfileDaoImpl profileDao) {
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