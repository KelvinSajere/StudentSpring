package com.studentapp.data.entity;


public class Student {
	
	private String name;
	private int studentID;
	private String department;
	
	
	/**
	 * @param name
	 * @param studentID
	 * @param department
	 */
	
	public Student(String name, int studentID, String department) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
