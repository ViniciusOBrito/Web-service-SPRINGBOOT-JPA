package com.PDCase.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PDCase.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
