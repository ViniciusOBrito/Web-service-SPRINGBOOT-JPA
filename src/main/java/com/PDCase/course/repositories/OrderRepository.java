package com.PDCase.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PDCase.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
