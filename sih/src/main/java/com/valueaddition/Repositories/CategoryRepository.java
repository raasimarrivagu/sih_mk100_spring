package com.valueaddition.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valueaddition.Beans.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
