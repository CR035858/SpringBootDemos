package com.gl.springthyme.springjspdemo.model;

public class Student {
	String studId;
	String studName;
	
	public Student() {
		super();
	}

	public Student(String studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	
}
