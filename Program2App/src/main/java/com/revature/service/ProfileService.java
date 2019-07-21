
package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.Profile;

@Component
public interface ProfileService {

	public Profile getProfileByUserId(int userId);

	public List<Profile> getAllProfiles();

	public void registerProfile(Profile profile);

}