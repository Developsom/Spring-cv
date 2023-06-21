package com.example.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvApplication {
	public static void main(String[] args) {
		// Add a breakpoint on the next line
		System.out.println("Application starting...");
		SpringApplication.run(CvApplication.class, args);
	}
}
