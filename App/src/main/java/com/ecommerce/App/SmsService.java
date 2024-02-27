package com.ecommerce.App;

public class SmsService implements MessageService{

	@Override
	public boolean sendMessage(String address, String message) {
		boolean messageStatus = false;
		String regex = "\\d{10}";
		if(address.matches(regex)) {
			messageStatus = true; 
			System.out.println("Message is "+message);
			System.out.println("SEnding it to "+address);
		}
		return messageStatus;
	}
	
	public void init() {
		System.out.println("Bean instantiated");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed");
	}
}