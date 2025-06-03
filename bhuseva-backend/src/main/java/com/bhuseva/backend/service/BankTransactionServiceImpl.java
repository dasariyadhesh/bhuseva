package com.bhuseva.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuseva.backend.entity.BankTransaction;
import com.bhuseva.backend.repository.BankTransactionRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Author: Yadhesh DG Copyright: Bhuseva Public Charitable Trust
 */
@Service
public class BankTransactionServiceImpl implements BankTransactionService {

	@Autowired
	private BankTransactionRepository transactionRepository;

	@Override
	public List<BankTransaction> getTransactionsByDate(LocalDate from, LocalDate to) {
		return transactionRepository.findByTransactionDateBetween(from, to);
	}

	@Override
	public List<BankTransaction> getTransactionsByDonor(Long donorId) {
		return transactionRepository.findByDonor_Id(donorId);
	}

	@Override
	public void uploadTransactions(List<BankTransaction> transactions) {
		transactionRepository.saveAll(transactions);
	}
}
