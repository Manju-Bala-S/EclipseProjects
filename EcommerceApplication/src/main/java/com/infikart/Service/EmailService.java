package com.infikart.Service;

public class EmailService implements MessageService {
	public boolean sendMessage(String address, String message) {
		boolean messageStatus = false;
		String regex =  "^[\\w.+\\-]+@[a-zA-Z\\-]+(\\.[a-zA-Z]+)+$";
		if(address.matches(regex)) {
			messageStatus = true; 
			System.out.println("Message is "+message);
			System.out.println("SEnding it to "+address);
		}
		return messageStatus;
	}
}
