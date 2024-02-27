package com.ecommerce.EmailService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

//@Component
public class Message {
	private String message;
	private LocalDate currentDate = LocalDate.now();
	private LocalTime currentTime = LocalTime.now();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private String formattedTime = currentTime.format(formatter);
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getCurrentDate() {
		return currentDate;
	}
//	public void setCurrentDate(LocalDate currentDate) {
//		this.currentDate = currentDate;
//	}
	public String getFormattedTime() {
		return formattedTime;
	}
//	public void setFormattedTime(String formattedTime) {
//		this.formattedTime = formattedTime;
//	}
//	
}
