package com.example.practice;

import com.example.practice.retry.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class
PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Autowired
	private MyService service;

	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("Inside CommandLineRunner..");
			try{
				service.testRetry();
			}
			catch (Exception e){
				System.out.println("Exception caught!");
			}
		};
	}

}
