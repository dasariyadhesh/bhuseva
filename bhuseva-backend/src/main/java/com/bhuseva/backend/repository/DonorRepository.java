package com.bhuseva.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuseva.backend.entity.Donor;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
public interface DonorRepository extends JpaRepository<Donor, Long> {
}
