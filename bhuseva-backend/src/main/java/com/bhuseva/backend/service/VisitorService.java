package com.bhuseva.backend.service;

import java.util.List;

import com.bhuseva.backend.entity.VisitorRegistrationRequest;

public interface VisitorService {
	VisitorRegistrationRequest applyAsVisitor(VisitorRegistrationRequest request);

	List<VisitorRegistrationRequest> getAllRequests(boolean approved);

	void approveVisitor(Long id);
}
