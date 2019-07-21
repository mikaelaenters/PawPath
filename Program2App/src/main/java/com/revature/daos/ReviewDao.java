package com.revature.daos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.beans.Reviews;

@Component
public interface ReviewDao {
public List<Reviews> getAllReviews();

public void saveReview(Reviews reviews);


}
