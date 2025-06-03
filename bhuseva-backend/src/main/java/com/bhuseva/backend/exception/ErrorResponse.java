package com.bhuseva.backend.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@Setter
@Getter
public class ErrorResponse {
	private String message;
	private LocalDateTime timestamp;

	public ErrorResponse(String message) {
		this.message = message;
		this.timestamp = LocalDateTime.now();
	}

}
