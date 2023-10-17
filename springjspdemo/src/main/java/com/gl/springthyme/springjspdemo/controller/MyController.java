package com.gl.springthyme.springjspdemo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.springthyme.springjspdemo.model.Student;
import com.gl.springthyme.springjspdemo.service.StudentService;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	@Autowired
	StudentService studentSvc;
	
	@RequestMapping("/greet")
	public String sayHello(Model model)
	{
		String greetings = "Hi Good Evening!!!";
		model.addAttribute("greetings", greetings);
		return "welcome";
	}
	
	@RequestMapping("/students")
	public String getStudentsCtrl(Model model)
	{
		ArrayList <Student> myStudents = studentSvc.getStudentsSvc();
		model.addAttribute("students", myStudents);
		return "student-list";
	}

}
