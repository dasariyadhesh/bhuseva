package com.bhuseva.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuseva.backend.entity.BankTransaction;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
	List<BankTransaction> findByTransactionDateBetween(LocalDate start, LocalDate end);

	List<BankTransaction> findByDonor_Id(Long donorId);
}
