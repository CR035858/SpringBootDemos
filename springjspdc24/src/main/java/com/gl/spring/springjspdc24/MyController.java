package com.gl.spring.springjspdc24;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	
	@RequestMapping("/greet")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Welcome To SpringBoot with Thymeleaf");
		return "welcome";
	}
}
