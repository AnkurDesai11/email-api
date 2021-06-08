package com.email.model;

public class EmailResponse {
	private String status;

	public EmailResponse(String status) {
		this.status = status;
	}

	public EmailResponse() {
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
