package com.studentapp.business.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentapp.data.entity.Student;

@Service
public class StudentService {
	
	private List<Student> student=Arrays.asList(
			
			new Student("John", 2, "Electrical"),
			new Student("Peter", 1, "Physical Science")
			
			);
	
	@RequestMapping(path="/student",method=RequestMethod.GET)
	public List<Student> getStudents(){
		
		return student;
		
	}

}
