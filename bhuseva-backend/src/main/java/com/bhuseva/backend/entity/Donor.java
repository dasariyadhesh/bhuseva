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
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String panNumber;

    @Embedded
    private Address address;

    @OneToOne
    private User user;
}
