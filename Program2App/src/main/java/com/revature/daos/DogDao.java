package com.revature.daos;

import java.util.List;

import com.revature.beans.Dogs;

public interface DogDao {
	List<Dogs> getAllDogs();
	void addDog(Dogs dog); 
	void deleteDog(int id);

}
