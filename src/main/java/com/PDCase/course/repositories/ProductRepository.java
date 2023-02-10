package com.PDCase.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PDCase.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
