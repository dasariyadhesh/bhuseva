package com.bhuseva.backend.dto;

import lombok.*;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
	private String email;
	private String password;
}
