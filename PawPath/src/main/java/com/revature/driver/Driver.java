package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Dog;
import com.revature.beans.Profile;
import com.revature.beans.Review;
import com.revature.beans.User;
import com.revature.beans.Walk;
import com.revature.util.SessionFactoryUtil;

public class Driver {
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		User mikaela = new User(-1, "menters", "1234", "customer", "Mikaela Enters");
		User jolie = new User(-1, "jolie", "wooof", "contactor", "Jolie G");
		Dog penelopeDog = new Dog(-1, mikaela, "Penelope", "PitBull", "Large", "Female", 2);
		Walk walk = new Walk(-1, jolie, penelopeDog, "February 20th", "10:00am", "78666", 30.50);
		Profile profile = new Profile(-1, "9729551337","7899200029", "2106 Briarwick ct", "Richardson", "TX", "75082", "my profile", mikaela);
		Review jolieReview = new Review(-1, walk, jolie, 10.00, "she was awesome");
		
		session.save(mikaela);
		session.save(jolie);
		session.save(penelopeDog);
		session.save(walk);
		session.save(profile);
		session.save(jolieReview);
		
		transaction.commit();
		
		session.close();
		sf.close();
	}
}
