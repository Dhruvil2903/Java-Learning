package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	 private final StudentService service;

	    public StudentController(StudentService service) {
	        this.service = service;
	    }

	    // Add single student
	    @PostMapping
	    public Student addStudent(@RequestBody Student student) {
	        return service.saveStudent(student);
	    }

	    // Bulk insert (10K students)
	    @PostMapping("/bulk")
	    public List<Student> addStudents(@RequestBody List<Student> students) {
	        return service.saveAllStudents(students);
	    }

	    // Get all students
	    @GetMapping
	    public List<Student> getStudents() {
	        return service.getAllStudents();
	    }

	    // Get student by ID
	    @GetMapping("/{id}")
	    public Student getStudent(@PathVariable int id) {
	        return service.getStudentById(id);
	    }

	    // Delete student
	    @DeleteMapping("/{id}")
	    public String deleteStudent(@PathVariable int id) {
	        service.deleteStudent(id);
	        return "Student deleted";
	    }
}
