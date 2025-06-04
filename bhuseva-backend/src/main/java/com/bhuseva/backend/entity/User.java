package com.bhuseva.backend.entity;

import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "\"user\"")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private boolean isApproved;  // For visitor registration approval

    @Enumerated(EnumType.STRING)
    private UserRole role;
}

