package com.example.employeemanagement.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception which send 404 status when it doesn't exist in database.
 * 
 * @author Sourabh
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserException extends RuntimeException {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserException(String message) {
		super(message);
		logger.error("User has encountered : {}", message.toString());
	}
}
