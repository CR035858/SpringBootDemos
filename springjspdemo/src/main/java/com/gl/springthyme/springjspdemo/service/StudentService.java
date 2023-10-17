package com.gl.springthyme.springjspdemo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springthyme.springjspdemo.dao.StudentDao;
import com.gl.springthyme.springjspdemo.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public ArrayList <Student> getStudentsSvc()
	{
		return studentDao.getStudents();
	}

}
