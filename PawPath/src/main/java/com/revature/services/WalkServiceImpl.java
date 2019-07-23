package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.User;
import com.revature.beans.Walk;
import com.revature.daos.WalkDao;

@Component
public class WalkServiceImpl implements WalkService {

	private WalkDao walkDao;
	
	@Autowired
	public void setWalkDao(WalkDao walkDao) {
		this.walkDao = walkDao;
	}
	
	@Override
	public void createWalk(Walk walk) {
		walkDao.saveWalk(walk);
	}

	@Override
	public Walk getWalkById(int id) {
		return walkDao.getWalkById(id);
	}

	@Override
	public List<Walk> getAllContractorWalks(User contractor) {
		return walkDao.getAllContractorWalks(contractor);
	}

}
