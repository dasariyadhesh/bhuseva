package com.bhuseva.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotApprovedException.class)
	public ResponseEntity<ErrorResponse> handleNotApproved(UserNotApprovedException ex) {
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponse(ex.getMessage()));
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAll(Exception ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponse(ex.getMessage()));
	}
}
