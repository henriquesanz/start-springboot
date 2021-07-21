package com.henriquepaiva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquepaiva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
