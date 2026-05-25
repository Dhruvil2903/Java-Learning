package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

//import com.example.demo.entity.Student;

@Service
public class StudentService {

	private StudentRepository repository;
	

	public StudentRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}


	public void addStudent(Student s) {
		repository.save(s);
	}

	public List<Student> getStudents() {
		
		return repository.findAll();
	}
	
}
