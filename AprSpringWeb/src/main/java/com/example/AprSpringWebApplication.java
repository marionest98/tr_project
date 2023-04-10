package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example", "com.test"})
public class AprSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprSpringWebApplication.class, args);
	}

}
