package com.bhuseva.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bhuseva.backend.entity.VisitorRegistrationRequest;
import com.bhuseva.backend.service.VisitorService;

import java.util.List;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

	@Autowired
	private VisitorService visitorService;

	@PostMapping("/register")
	public VisitorRegistrationRequest apply(@RequestBody VisitorRegistrationRequest req) {
		return visitorService.applyAsVisitor(req);
	}

	@GetMapping("/pending")
	public List<VisitorRegistrationRequest> getPendingRequests() {
		return visitorService.getAllRequests(false);
	}

	@PutMapping("/approve/{id}")
	public void approve(@PathVariable Long id) {
		visitorService.approveVisitor(id);
	}
}
