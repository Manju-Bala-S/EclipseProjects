package com.ecommerce.App;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
        MessageService msg1 = (MessageService) context.getBean("SmsService");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address:");
        String address = sc.nextLine();
        System.out.print("Enter message:");
        String message = sc.nextLine();
        msg1.sendMessage(address,message);
    }
}
