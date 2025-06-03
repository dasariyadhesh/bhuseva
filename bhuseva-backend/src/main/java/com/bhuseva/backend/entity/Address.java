package com.bhuseva.backend.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}

