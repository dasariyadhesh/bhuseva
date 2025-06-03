package com.bhuseva.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuseva.backend.entity.VisitorRegistrationRequest;
import com.bhuseva.backend.repository.VisitorRegistrationRequestRepository;

import java.util.List;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Service
public class VisitorServiceImpl implements VisitorService {

	@Autowired
	private VisitorRegistrationRequestRepository requestRepository;

	@Override
	public VisitorRegistrationRequest applyAsVisitor(VisitorRegistrationRequest request) {
		request.setApproved(false);
		return requestRepository.save(request);
	}

	@Override
	public List<VisitorRegistrationRequest> getAllRequests(boolean approved) {
		return requestRepository.findByApproved(approved);
	}

	@Override
	public void approveVisitor(Long id) {
		VisitorRegistrationRequest req = requestRepository.findById(id).orElseThrow();
		req.setApproved(true);
		requestRepository.save(req);
	}
}
