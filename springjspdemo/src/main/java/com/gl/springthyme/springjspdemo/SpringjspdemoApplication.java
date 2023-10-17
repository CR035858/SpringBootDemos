package com.gl.springthyme.springjspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.gl.springthyme.springjspdemo.controller","com.gl.springthyme.springjspdemo"})
public class SpringjspdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjspdemoApplication.class, args);
		System.out.println("Welcome");
	}

}
