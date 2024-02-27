package com.infikart.Factory;
import com.infikart.Service.MessageService;
import com.infikart.Service.SmsService;

public class MessageFactory {
	private static MessageService message;
	
	public static MessageService factoryMethod() {
		message = new SmsService();
		return message;
	}
	
	
}
