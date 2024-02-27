package com.ecommerce.AppAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean

	public SmsService getSmsService1() {
		return new SmsService();
	}
	
	@Bean

	public SmsService getSmsService2(){
		return new SmsService();
	}
	@Bean
	public EmailService getEmailService() {
		return new EmailService();
	}
	@Bean
	public InstagramService getInstagramService() {
		return new InstagramService(60);
	}
}
