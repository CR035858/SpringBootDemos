package com.gl.thymes.ThymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	@RequestMapping("/greet")
	public String sayHello(Model model)
	{
		model.addAttribute("message", "Hi Welcome to Thymeleaf");
		return "welcome";
	}

}
