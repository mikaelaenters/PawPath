package com.revature.daos;

import java.util.List;

import com.revature.beans.Review;
import com.revature.beans.User;

public interface ReviewDao {

	public void saveReview(Review review);
	public Review readReview(int id);
	public List<Review> allContractorsReviews(User contractor);
	public void updateReview(Review review);
	public void deleteReview(Review review);
}
