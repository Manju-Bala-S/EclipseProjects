package com.ecommerce.App;

public class InstagramService implements MessageService{
	int messageLength;
	public InstagramService(int messageLength){
		this.messageLength = messageLength;
	}
	public boolean sendMessage(String address, String message) {
		boolean messageStatus = false;
		if(address.contains("@") && message.length()<=this.messageLength) {
			messageStatus = true; 
			System.out.println("Message is "+message);
			System.out.println("SEnding it to "+address);
		}
		return messageStatus;
	}
}