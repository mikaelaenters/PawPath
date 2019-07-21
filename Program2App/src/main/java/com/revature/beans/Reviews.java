package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rid")
	private Integer rid;
	
	@Column(name="walk_id")
	private Integer walkId;
	
	@Column(name="walker")
	private Integer walker;
	
	@Column(name="reviwer")
	private Integer reviewer;
	
	@Column(name="rating")
	private Double rating;
	
	@Column(name="commentary")
	private String commentary;

}
