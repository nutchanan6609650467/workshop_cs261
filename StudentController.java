package com.example.crud;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/students")


public class StudentController {
	
	private final StudentRepository studentRepository;
	

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository; 
	}
	
	@GetMapping 
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

}
