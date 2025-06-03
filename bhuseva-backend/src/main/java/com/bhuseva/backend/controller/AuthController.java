package com.bhuseva.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.bhuseva.backend.dto.AuthRequest;
import com.bhuseva.backend.dto.AuthResponse;
import com.bhuseva.backend.entity.User;
import com.bhuseva.backend.entity.UserRole;
import com.bhuseva.backend.repository.UserRepository;
import com.bhuseva.backend.security.JwtUtil;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authManager;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private com.bhuseva.backend.service.AuthService authService;

	@PostMapping("/register")
	public String register(@RequestBody AuthRequest request) {
		if (userRepo.findByEmail(request.getEmail()).isPresent())
			return "Email already registered!";
		User user = User.builder().email(request.getEmail()).password(encoder.encode(request.getPassword()))
				.fullName("New User").role(UserRole.VISITOR).isApproved(false).build();
		userRepo.save(user);
		return "Registered! Awaiting admin approval.";
	}

	@PostMapping("/login")
	public AuthResponse login(@RequestBody AuthRequest request) {
		authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
		User user = userRepo.findByEmail(request.getEmail()).orElseThrow();
		if (!user.isApproved())
			throw new RuntimeException("User not approved by admin.");
		String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name());
		return new AuthResponse(token, user.getRole().name());
	}

	@PutMapping("/approve/{id}")
	public void approveUser(@PathVariable Long id) {
		authService.approveUser(id);
	}

	@PutMapping("/role/{id}")
	public void changeRole(@PathVariable Long id, @RequestParam UserRole role) {
		authService.updateRole(id, role);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		authService.deleteUser(id);
	}
}
