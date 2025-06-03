package com.bhuseva.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.bhuseva.backend.repository.UserRepository;
import java.util.Collections;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		com.bhuseva.backend.entity.User user = repository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));

		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				Collections.singleton(() -> "ROLE_" + user.getRole().name()));
	}
}
