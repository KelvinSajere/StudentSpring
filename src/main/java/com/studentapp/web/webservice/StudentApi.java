/**
 * 
 */
package com.studentapp.web.webservice;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.business.service.StudentService;
import com.studentapp.data.entity.Student;

/**
 * @author Kelvin sajere
 *
 */
@RestController
public class StudentApi {

	@Autowired
	private StudentService studentservice;

	@RequestMapping(path = "/student", method = RequestMethod.GET)
	public Map<Integer, Student> getStudent() {

		return studentservice.getAllStudents();

	}

	@RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
	public Student findStudentById(@PathVariable String id) {

		return studentservice.findStudentById(id);

	}
}
