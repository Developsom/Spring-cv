package com.example.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.cv.config")
public class CvApplication {
	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}
}

