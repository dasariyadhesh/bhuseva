package com.bhuseva.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.bhuseva.backend.entity.BankTransaction;
import com.bhuseva.backend.service.BankTransactionService;

import java.time.LocalDate;
import java.util.List;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@RestController
@RequestMapping("/api/transactions")
public class BankTransactionController {

	@Autowired
	private BankTransactionService transactionService;

	@PostMapping("/upload")
	public void upload(@RequestBody List<BankTransaction> transactions) {
		transactionService.uploadTransactions(transactions);
	}

	@GetMapping("/by-date")
	public List<BankTransaction> getByDateRange(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
		return transactionService.getTransactionsByDate(from, to);
	}

	@GetMapping("/by-donor/{donorId}")
	public List<BankTransaction> getByDonor(@PathVariable Long donorId) {
		return transactionService.getTransactionsByDonor(donorId);
	}
}
