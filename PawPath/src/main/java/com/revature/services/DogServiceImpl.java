package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Dog;
import com.revature.daos.DogDao;

@Component
public class DogServiceImpl implements DogService {
	
	private DogDao dogDao;
	
	@Autowired
	public void setDogDao(DogDao dogDao) {
		this.dogDao = dogDao;
	}
	
	@Override
	public List<Dog> getAllUserDogs(int id) {
		return dogDao.getAllDogsByUser(id);
	}

	@Override
	public void createDog(Dog dog) {
		dogDao.addDog(dog);
	}

	@Override
	public void updateDog(Dog dog) {
		dogDao.updateDog(dog);
	}

	@Override
	public void deleteDog(Dog dog) {
		dogDao.deleteDog(dog.getDogId());
	}

}
