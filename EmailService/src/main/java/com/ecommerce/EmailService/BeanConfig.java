package com.ecommerce.EmailService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.ecommerce.EmailService")
public class BeanConfig {
	@Bean
	public User getUser() {
		return new User();
	}
	
	@Bean 
	@Scope("prototype")
	public Inbox getInbox() {
		return new Inbox();
	}
	
	@Bean("m1") 
	@Scope("prototype")
	public Message getMessage() {
		return new Message();
	}
}
