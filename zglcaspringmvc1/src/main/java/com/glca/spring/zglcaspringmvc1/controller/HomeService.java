package com.glca.spring.zglcaspringmvc1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
	
	@Autowired
	HomeDao homeDao;
	
	public List <Employee> getEmployeesSvc()
	{
		return homeDao.getEmployees();
	}
	

}
