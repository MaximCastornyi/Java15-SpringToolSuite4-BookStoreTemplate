package com.bookstore.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
