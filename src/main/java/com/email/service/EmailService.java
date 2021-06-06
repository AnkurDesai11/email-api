package com.email.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
	public boolean sendEmail(String subject, String message, String to) {
		
		boolean done = false;
		
		String from="ankurdesai7811@gmail.com";
		
		//variable for gmail
		String host = "smtp.gmail.com";
		
		//get system properties
		Properties properties = System.getProperties();
		System.out.println("Properties: "+properties);
		
		//setting important information to properties object
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		//Step 1: get session object
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ankurdesai7811@gmail.com", "****");
			}
		});
		
		session.setDebug(true);
		
		//Step 2: compose the message [text, multimedia]
		MimeMessage m = new MimeMessage(session);
		
		try {
			
			//adding sender
			m.setFrom(from);
			
			//adding recipient
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));//we can pass an array here if multiple recipients are required
		
			//adding subject
			m.setSubject(subject);
			
			//adding text
			m.setText(message);
			
			//send
			
			//Step 3: send message using transport class
			Transport.send(m);;
			
			done = true;
			System.out.println("email sent");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return done;
	}
}
