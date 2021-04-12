package com.bookstore.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.demo.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
