package com.revature.services;

import java.util.List;

import com.revature.beans.Review;
import com.revature.beans.User;

public interface ReviewService {
	
	public Review getReviewById(int id);
	public List<Review> getAllContractorReviews(User contractor);
	public void createReview(Review review);
	public void updateAReview(Review review);
	
}
