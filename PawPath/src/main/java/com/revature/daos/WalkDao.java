package com.revature.daos;

import java.util.List;

import com.revature.beans.User;
import com.revature.beans.Walk;

public interface WalkDao {
	
	public List<Walk> getAllContractorWalks(User user);
	public void saveWalk(Walk walk);
	public Walk getWalkById(int id);
	public void updateWalk(Walk walk);
	public void deleteWalk(Walk walk);
}
