package com.bhuseva.backend.service;

import com.bhuseva.backend.entity.User;
import com.bhuseva.backend.entity.UserRole;

public interface AuthService {
	User registerUser(User user);

	String login(String email, String password);

	void approveUser(Long userId);

	void updateRole(Long userId, UserRole role);

	void deleteUser(Long userId);
}
