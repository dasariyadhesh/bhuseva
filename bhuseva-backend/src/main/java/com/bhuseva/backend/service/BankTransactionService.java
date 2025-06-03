package com.bhuseva.backend.service;

import java.time.LocalDate;
import java.util.List;

import com.bhuseva.backend.entity.BankTransaction;

public interface BankTransactionService {
	List<BankTransaction> getTransactionsByDate(LocalDate from, LocalDate to);

	List<BankTransaction> getTransactionsByDonor(Long donorId);

	void uploadTransactions(List<BankTransaction> transactions);
}
