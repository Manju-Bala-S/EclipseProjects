package com.infikart;

import com.infikart.Factory.MessageFactory;
import com.infikart.Service.InstagramService;
import com.infikart.Service.MessageService;
import com.infikart.Service.SmsService;

public class InfikartApp {
	private MessageService message = MessageFactory.factoryMethod();
	public void send(String address , String message) {
		boolean messageStatus = this.message.sendMessage(address, message);
		if(messageStatus == false) {
			System.out.println("Invalid address given");
		}
	}
}
