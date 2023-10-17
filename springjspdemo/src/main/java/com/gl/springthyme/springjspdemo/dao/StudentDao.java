package com.gl.springthyme.springjspdemo.dao;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.gl.springthyme.springjspdemo.model.Student;

@Repository
public class StudentDao {

	ArrayList <Student> students = new ArrayList<Student>();
	
	public ArrayList <Student> getStudents()
	{
		students.add(new Student("S001","Harsha"));
		students.add(new Student("S002","Kiran"));
		students.add(new Student("S003","Suman"));
		return students;
	}
	
}
