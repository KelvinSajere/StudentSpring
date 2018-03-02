/**
 * 
 */
package com.studentapp.web.webservice;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(path = "/student")
	public Map<Integer, Student> getStudent() {

		return studentservice.getAllStudents();

	}

	@GetMapping(path = "/student/{id}")
	public Student findStudentById(@PathVariable int id, HttpServletResponse response) {
		Student student=studentservice.findStudentById(id);
		if(student==null) {
			response.setStatus(HttpStatus.NO_CONTENT.value());
		}
		return studentservice.findStudentById(id);

	}

	@PostMapping(path = "/student")
	public void addStudent(@RequestBody Student student) {

		studentservice.addStudent(student);

	}
}
