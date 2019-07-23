package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Review;
import com.revature.beans.User;
import com.revature.daos.ReviewDao;

@Component
public class ReviewServiceImpl implements ReviewService {

	private ReviewDao reviewDao;
	
	@Autowired
	public void setReviewDao(ReviewDao reviewDao) {
		this.reviewDao = reviewDao;
	}
	
	@Override
	public Review getReviewById(int id) {
		return reviewDao.readReview(id);
	}

	@Override
	public List<Review> getAllContractorReviews(User contractor) {
		return reviewDao.allContractorsReviews(contractor);
	}

	@Override
	public void createReview(Review review) {
		reviewDao.saveReview(review);
	}

	@Override
	public void updateAReview(Review review) {
		reviewDao.updateReview(review);
	}

}
