package com.ecommerce.AppAnno;

import com.ecommerce.AppAnno.*;

public class SmsService implements MessageService{

	public String address;
	private String message;
	
	@Override
	public boolean sendMessage(String address, String message) {
		this.address = address;
		this.message = message;
		boolean messageStatus = false;
		String regex = "\\d{10}";
		if(address.matches(regex)) {
			messageStatus = true; 
			System.out.println("Message is "+message);
			System.out.println("SEnding it to "+address);
		}
		return messageStatus;
	}
	
	public String getAddress() {
		return address;
	}

	public String getMessage() {
		return message;
	}

	public void init() {
		System.out.println("Bean instantiated");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed");
	}
}