package com.valueaddition.Beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
public class Farmer {
	@Id
	@PrimaryKeyJoinColumn
	private int farmerId;
	
	private String name;
	private String address;
	private int phoneNo;
	private int noOfPosts;
	private String email;
	
//	@ManyToOne(targetEntity = Post.class)
//	private Set<Post> posts;
	
	
//	public Set<Post> getPosts() {
//		return posts;
//	}
//	public void setPosts(Set<Post> posts) {
//		this.posts = posts;
//	}
//	
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getNoOfPosts() {
		return noOfPosts;
	}
	public void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
