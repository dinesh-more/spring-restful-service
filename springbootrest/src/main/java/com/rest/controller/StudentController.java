package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Student;
import com.rest.repository.StudentRepository;

@RestController
@RequestMapping("api")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("list-student")
	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@GetMapping("student/{roll_no}")
	public Optional<Student> getStudent(@PathVariable Long roll_no) {
		return studentRepository.findById(roll_no);
	}

	@PostMapping("add-student")
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

	@PutMapping("update-student")
	public Student updateStudent(@RequestBody Student student) {
		if (studentRepository.findById(student.getStudent_rollno()).equals(student.getStudent_rollno()))
			studentRepository.save(student);
		return student;
	}

	@DeleteMapping("remove-student/{roll_no}")
	public void removeStudent(@PathVariable Long roll_no) {
		if (studentRepository.findById(roll_no) != null)
			studentRepository.deleteById(roll_no);
	}
}
