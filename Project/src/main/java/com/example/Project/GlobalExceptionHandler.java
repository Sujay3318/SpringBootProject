package com.example.Project;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BadRequest.class)
	public ResponseEntity<Object> studentNotFoundResponse(Exception ex, WebRequest request) {
		
		return handleExceptionInternal(ex, ex, null, HttpStatus.NOT_FOUND, request);
	}
}