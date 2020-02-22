package com.valueaddition.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valueaddition.Beans.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
	
	

	
}
