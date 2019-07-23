package com.revature.daos;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Review;
import com.revature.beans.User;
import com.revature.util.SessionFactoryUtil;

@Component
public class ReviewDaoImpl implements ReviewDao {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public void saveReview(Review review) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(review);
		transaction.commit();
		session.close();
	}

	@Override
	public Review readReview(int id) {
		Session session = sf.openSession();
		Review review = (Review) session.get(Review.class, id);
		session.close();
		return review;
	}

	@Override
	public List<Review> allContractorsReviews(User contractor) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Review.class).add(eq("walker", contractor.getUserId()));
		
		List<Review> allContractorReviews = criteria.list();
		
		session.close();
		return allContractorReviews;
	}

	@Override
	public void updateReview(Review review) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(review);
		transaction.commit();
		session.close();
	}

	@Override
	public void deleteReview(Review review) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(review);
		transaction.commit();
		session.close();
	}
}
