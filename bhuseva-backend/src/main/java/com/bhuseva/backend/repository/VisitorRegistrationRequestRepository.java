package com.bhuseva.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuseva.backend.entity.VisitorRegistrationRequest;

import java.util.List;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
public interface VisitorRegistrationRequestRepository extends JpaRepository<VisitorRegistrationRequest, Long> {
	List<VisitorRegistrationRequest> findByApproved(boolean approved);
}
