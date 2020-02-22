package com.valueaddition.Beans;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Item {
	
	@Id
	@PrimaryKeyJoinColumn
	private int itemId;
	
	@ManyToOne(targetEntity = Category.class)
	private Category category;
	
	@OneToMany
	private Set<Post> posts ;
	
	
	private String itemName;
	private int noOfPosts;
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getNoOfPosts() {
		return noOfPosts;
	}
	public void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}
	
	

}
