package com.revature.daos;

import java.util.List;

import com.revature.beans.Dog;
import com.revature.beans.User;

public interface DogDao {
	
	public List<Dog> getAllDogsByUser(int id);
	public void addDog(Dog dog); 
	public void deleteDog(int id);
	public void updateDog(Dog dog);
	public Dog readDog(int id);
	
}
