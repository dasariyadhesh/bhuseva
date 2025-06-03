package com.bhuseva.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuseva.backend.entity.User;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}