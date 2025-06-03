package com.bhuseva.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bhuseva.backend.entity.Donor;
import com.bhuseva.backend.service.DonorService;

import java.util.List;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@RestController
@RequestMapping("/api/donors")
public class DonorController {

	@Autowired
	private DonorService donorService;

	@PostMapping("/")
	public Donor createDonor(@RequestBody Donor donor) {
		return donorService.addDonor(donor);
	}

	@GetMapping("/")
	public List<Donor> getAll() {
		return donorService.getAllDonors();
	}
}
