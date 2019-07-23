package com.revature.daos;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Dog;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class DogDaoImpl implements DogDao {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public List<Dog> getAllDogsByUser(int id) {
		Session session = sf.openSession();
//		Criteria criteria = session.createCriteria(Dog.class).add(eq("owner_id", id));
//		
//		List<Dog> allUserDogs = criteria.list();
		String hql = "FROM Dog WHERE owner_id = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		List<Dog> allUserDogs = (List<Dog>) query.list();
		System.out.println(allUserDogs.get(0).getBreed());
		session.close();
		return allUserDogs;
	}


	@Override
	public void addDog(Dog dog) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(dog);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteDog(int id) {
		Session sess = sf.openSession();
	    Dog dog = (Dog) sess.get(Dog.class, id);
	    sess.delete(dog);
		sess.close();
	}

	@Override
	public void updateDog(Dog dog) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(dog);
		tx.commit();
		sess.close();
	}

	@Override
	public Dog readDog(int id) {
		Session session = sf.openSession();
		Dog dog = (Dog) session.get(Dog.class, id);
		session.close();
		return dog;
	}

}
