package com.glca.spring.zglcaspringmvc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.glca.spring.zglcaspringmvc1.controller","com.glca.spring.zglcaspringmvc1"})
public class Zglcaspringmvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Zglcaspringmvc1Application.class, args);
		System.out.println("Welcome to SpringBoot ....");
	}

}
