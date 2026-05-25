package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("Dhruvil");
		s.setMarks(100);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		
		System.out.println(students);
	}

}
