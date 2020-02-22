package com.valueaddition.Beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Category {

	@Id
	@PrimaryKeyJoinColumn
	private int categoryId;
	
	@OneToMany(targetEntity = Item.class)
	private Set<Item> items;
	
	private String categoryName;
	private int noOfItems;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
	
	
	
	
}
