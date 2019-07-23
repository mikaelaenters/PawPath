package com.revature.services;

import java.util.List;

import com.revature.beans.Dog;
import com.revature.beans.User;

public interface DogService {

	public List<Dog> getAllUserDogs(int id);
	public void createDog(Dog dog);
	public void updateDog(Dog dog);
	public void deleteDog(Dog dog);
	
}
