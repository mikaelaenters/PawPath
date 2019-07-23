package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.beans.Dog;
import com.revature.beans.Profile;
import com.revature.beans.Review;
import com.revature.beans.User;
import com.revature.beans.Walk;

public class SessionFactoryUtil {

	private static SessionFactory sf;
	
	static {
		
		Configuration configuration = new Configuration().configure();

		
		//Edit environment variables for builds in JENKINS
		//Windows Edit environment variables
		configuration.setProperty("hibernate.connection.username", System.getenv("BEARS_USERNAME"));
		configuration.setProperty("hibernate.connection.password", System.getenv("BEARS_PASSWORD"));
		configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://" + System.getenv("BEARS_URL") + ":5432/jourden1905java?");
		//In case not in public schema
		//configuration.setProperty("hibernate.default_schema",  System.getev("BEARS_SCHEMA"));
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties()).build();
//		
//		sf = configuration.buildSessionFactory(serviceRegistry);
		
		sf = configuration.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Profile.class)
				.addAnnotatedClass(Dog.class)
				.addAnnotatedClass(Walk.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
}