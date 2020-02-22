package com.valueaddition.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valueaddition.Beans.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	
}
