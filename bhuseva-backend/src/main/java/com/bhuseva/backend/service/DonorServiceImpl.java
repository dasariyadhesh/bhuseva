package com.bhuseva.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuseva.backend.entity.Donor;
import com.bhuseva.backend.repository.DonorRepository;

import java.util.List;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Service
public class DonorServiceImpl implements DonorService {

	@Autowired
	private DonorRepository donorRepository;

	@Override
	public Donor addDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	@Override
	public List<Donor> getAllDonors() {
		return donorRepository.findAll();
	}
}
