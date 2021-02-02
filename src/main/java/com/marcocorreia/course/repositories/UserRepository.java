package com.marcocorreia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcocorreia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
