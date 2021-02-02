package com.marcocorreia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcocorreia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
