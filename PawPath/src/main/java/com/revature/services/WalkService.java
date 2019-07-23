package com.revature.services;

import java.util.List;

import com.revature.beans.User;
import com.revature.beans.Walk;

public interface WalkService {
	
	public void createWalk(Walk walk);
	public Walk getWalkById(int id);
	public List<Walk> getAllContractorWalks(User contractor);
}
