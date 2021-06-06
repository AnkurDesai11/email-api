package com.email.model;


public class EmailRequest {
	private String to;
	private String subject;
	private String message;
	
	public EmailRequest() {
	}

	public EmailRequest(String subject, String message, String to) {
		this.to = to;
		this.subject = subject;
		this.message = message;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmailRequest{" + 
				"to='" + to + '\'' +
				", subject='" + subject + '\'' +
				", message='" + message + '\'' +
				'}';
				
	}
	
	
	
}
