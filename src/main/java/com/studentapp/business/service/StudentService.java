package com.studentapp.business.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.studentapp.data.entity.Student;

@Service
public class StudentService {

	/**
	 * @param student
	 */
	private Map<Integer, Student> student;

	public StudentService() {
		student = new HashMap<>();

		student.put(1, new Student("John", 1, "Electrical"));
		student.put(2, new Student("Peter", 2, "Chemistry"));

	}

	public Map<Integer, Student> getAllStudents() {

		return student;

	}

	public Student findStudentById(String id) {
		if (student.containsKey(id))
			return student.get(id);
		else
			return null;

	}

}
