package com.example.practice;

import org.springframework.boot.CommandLineRunner;
// import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner  {
	

	public static void main(String[] args) {
	SpringApplication.run(PracticeApplication.class, args);
	
	
	}
	private PaymentServices paymentServices;
	public PracticeApplication(RazorPay paymentServices){
		this.paymentServices=paymentServices;

	}
	
	

	@Override
	public void run(String...args){
		System.out.println(paymentServices.pay());
		
	}

	
	
	
	
	

}
