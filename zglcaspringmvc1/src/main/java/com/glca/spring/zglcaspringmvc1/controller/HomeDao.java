package com.glca.spring.zglcaspringmvc1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {
	
	List <Employee> employees;
	
	public HomeDao()
	{
		employees = new ArrayList<Employee>();
		employees.add(new Employee("E001","Harsha"));
		employees.add(new Employee("E002","Kiran"));
		employees.add(new Employee("E003","Kishan"));
		employees.add(new Employee("E004","Kumar"));
		employees.add(new Employee("E005","Meenal"));
	}
	public List <Employee> getEmployees()
	{
		return employees;
	}

}
