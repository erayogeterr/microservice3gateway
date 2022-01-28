package com.sha.microservice3gateway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.microservice3gateway.model.User;

public interface IUserRepository extends JpaRepository<User,Long> {

	Optional<User> findByUsername(String username);
}
