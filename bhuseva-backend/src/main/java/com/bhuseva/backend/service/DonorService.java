package com.bhuseva.backend.service;

import java.util.List;

import com.bhuseva.backend.entity.Donor;

public interface DonorService {
	Donor addDonor(Donor donor);

	List<Donor> getAllDonors();
}
