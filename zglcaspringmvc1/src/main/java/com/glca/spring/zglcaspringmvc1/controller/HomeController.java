package com.glca.spring.zglcaspringmvc1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "welcome";
	}
	
	@RequestMapping("/employees")
	public String getEmployees(Model model)
	{
		List <Employee> employees = homeService.getEmployeesSvc();
		model.addAttribute("employees", employees);
		return "employeeslist";
	}

}
