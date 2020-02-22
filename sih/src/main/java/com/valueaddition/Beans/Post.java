package com.valueaddition.Beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Post {
	
	@Id
	@PrimaryKeyJoinColumn
	private int postId;
	
	private String postTitle;
	private String description;
	
//	@OneToMany
//	private Farmer farmer;
//	
//	@OneToMany
//	private Item item;
	
	private int rating;
	private int hits;
	private Date postedOn;
	
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getHits() {
		return hits;
	}
//	public Farmer getFarmer() {
//		return farmer;
//	}
//	public void setFarmer(Farmer farmer) {
//		this.farmer = farmer;
//	}
//	public Item getItem() {
//		return item;
//	}
//	public void setItem(Item item) {
//		this.item = item;
//	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	
	
	
	
}
