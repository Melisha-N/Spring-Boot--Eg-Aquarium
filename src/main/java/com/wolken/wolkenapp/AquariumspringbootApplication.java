package com.wolken.wolkenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AquariumspringbootApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AquariumspringbootApplication.class, args);
		
		System.out.println("Inside main() of AquariumspringbootApplication");
		
		System.out.println("Mel");
		
		System.out.println("Greetings Spring Boot");
		
		System.out.println("End of main() of AquariumspringbootApplication");
	}

}
