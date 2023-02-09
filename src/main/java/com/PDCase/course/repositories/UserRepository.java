package com.PDCase.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PDCase.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
