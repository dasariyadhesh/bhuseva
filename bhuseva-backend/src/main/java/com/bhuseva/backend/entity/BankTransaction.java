package com.bhuseva.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionType; // Credit / Debit
    private String description;
    private double amount;
    private LocalDate transactionDate;

    @ManyToOne
    private Donor donor;
}

