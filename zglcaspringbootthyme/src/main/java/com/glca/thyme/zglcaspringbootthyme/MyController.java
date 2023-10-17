package com.glca.thyme.zglcaspringbootthyme;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class MyController {

	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "welcome to SpringBoot based Thymeleaf apps");
		return "welcome";
	}
	
	@RequestMapping("/students")
	public String getStudents(Model model)
	{
		List <Student> students = new ArrayList<Student>();
		students.add(new Student("S001","Harsha"));
		students.add(new Student("S002","Kiran"));
		students.add(new Student("S003","Mamatha"));
		model.addAttribute("students", students);
		return "studentslist";
		
	}
	
}
