package com.ecommerce.EmailService;

import java.time.*;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Inbox {
	
	private String receiverId;
	
	@Autowired
	//@Qualifier("m1")
	Message m1;
	
	public Message getM1() {
		return m1;
	}
	public void setM1(Message m1) {
		this.m1 = m1;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
}
