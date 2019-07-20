package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Profile;
import com.revature.service.ProfileServiceImpl;

@RestController("/profile")
@CrossOrigin(origins="*")
public class ProfileController {
	
	private ProfileServiceImpl profileService;

	@Autowired
	private void setProfileService(ProfileServiceImpl profileService) {
		this.profileService = profileService;
	}
	
	@GetMapping
	public List<Profile> getAllProfiles(){
		return profileService.getAllProfiles();
	}
	
	@GetMapping("/Profile/{userId}")
	public Profile getProfileByUserId(@PathVariable int userId) {
		return profileService.getProfileByUserId(userId);
	}
	
	@PostMapping(consumes="application/json")
	public String saveProfile(@RequestBody Profile profile) {
		profileService.registerProfile(profile);
		return "success";
	}

}
