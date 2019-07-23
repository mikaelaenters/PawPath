package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="reviews")
public class Review {

	//Fields;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rid")
	private int reviewId;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="walk_id")
	private Walk reviewedWalk;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="walker")
	private User walker;
	
	@Column(name="rating")
	private double rating;
	
	@Column(name="commentary")
	private String comments;

	//Constructors;
	public Review() {
		
	}
	
	public Review(int reviewId, Walk reviewedWalk, User walker, double rating, String comments) {
		super();
		this.reviewId = reviewId;
		this.reviewedWalk = reviewedWalk;
		this.walker = walker;
		this.rating = rating;
		this.comments = comments;
	}

	//Getters &Setters;
	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Walk getReviewedWalk() {
		return reviewedWalk;
	}

	public void setReviewedWalk(Walk reviewedWalk) {
		this.reviewedWalk = reviewedWalk;
	}

	public User getWalker() {
		return walker;
	}

	public void setWalker(User walker) {
		this.walker = walker;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
