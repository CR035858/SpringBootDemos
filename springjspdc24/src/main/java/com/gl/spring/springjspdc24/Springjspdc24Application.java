package com.gl.spring.springjspdc24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.gl.spring.springjspdc24"})
public class Springjspdc24Application {

	public static void main(String[] args) {
		SpringApplication.run(Springjspdc24Application.class, args);
		System.out.println("Started Spring Boot Project");
	}

}
