package com.health.insurance.service.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorDetails{

	private LocalDateTime timeStamp;
	private HttpStatus responseEntity;
	private int errorCode;
	private String errorMessage;
	
	
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	
	
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	public HttpStatus getResponseEntity() {
		return responseEntity;
	}
	
	
	public void setResponseEntity(HttpStatus responseEntity) {
		this.responseEntity = responseEntity;
	}
	
	
	public int getErrorCode() {
		return errorCode;
	}
	
	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
