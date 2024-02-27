package com.ecommerce.AppAnno;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	 
    	 Scanner sc = new Scanner(System.in);
    	 Scanner sc1 = new Scanner(System.in);
    	 System.out.println("Enter 1 to use Sms Service , 2 to use Email service and 3 to use Instagram service");
    	 int choice = sc1.nextInt();
    	 if(choice==1)
    	 {
    		 SmsService s2 = (SmsService) factory.getBean("getSmsService1");
             System.out.print("Enter mobile number:");
             String address = sc.nextLine();
             System.out.print("Enter message:");
             String message = sc.nextLine();
             //SmsService s1 = new SmsService();
             SmsService s3 = (SmsService) factory.getBean("getSmsService2");
             boolean status = s2.sendMessage(address,message);
             boolean status1 = s3.sendMessage("1234567899","hiii");
             
             System.out.println("s2:"+s2);
             System.out.println("s3-> Addr:"+s3.getAddress()+" Msg: "+s3.getMessage());
             System.out.println("s2-> Addr:"+s2.getAddress()+" Msg: "+s2.getMessage());

             if(status==false) {
            	 System.out.println("Invalid mobile number");
             }
             
             if(status1==false) {
            	 System.out.println("Invalid mobile number");
             } 
    	 }
    	 else if(choice==2) {
    		 EmailService s2 = factory.getBean(EmailService.class);
             System.out.print("Enter email address:");
             String address = sc.nextLine();
             System.out.print("Enter message:");
             String message = sc.nextLine();
             //SmsService s1 = new SmsService();
             boolean status = s2.sendMessage(address,message);
             if(status==false) {
            	 System.out.println("Mail id not found");
             } 
    	 }
    	 else if(choice==3) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    		 InstagramService s2 = factory.getBean(InstagramService.class);
             System.out.print("Enter instagram id:");
             String address = sc.nextLine();
             System.out.print("Enter message:");
             String message = sc.nextLine();
             //SmsService s1 = new SmsService();
             boolean status = s2.sendMessage(address,message);
             if(status==false) {
            	 System.out.println("Instagram id not found");
             } 
    	 }
    }
}
