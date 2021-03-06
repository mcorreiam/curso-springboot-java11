package com.marcocorreia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcocorreia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
