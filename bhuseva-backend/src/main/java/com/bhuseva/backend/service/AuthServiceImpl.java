package com.bhuseva.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuseva.backend.entity.User;
import com.bhuseva.backend.entity.UserRole;
import com.bhuseva.backend.repository.UserRepository;

import java.util.Optional;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		// Logic to hash password & validate email
		return userRepository.save(user);
	}

	@Override
	public String login(String email, String password) {
		// Validate user and return JWT
		return "dummy-jwt-token";
	}

	@Override
	public void approveUser(Long userId) {
		User user = userRepository.findById(userId).orElseThrow();
		user.setApproved(true);
		userRepository.save(user);
	}

	@Override
	public void updateRole(Long userId, UserRole role) {
		User user = userRepository.findById(userId).orElseThrow();
		user.setRole(role);
		userRepository.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
}
