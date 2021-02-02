package com.marcocorreia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcocorreia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
