package com.bhuseva.backend.exception;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
public class UserNotApprovedException extends RuntimeException {
	public UserNotApprovedException(String message) {
		super(message);
	}
}
