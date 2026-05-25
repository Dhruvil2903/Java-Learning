package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BeanFactoryApplication.class, args);
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("BeanFactory.xml");
		
		Student student = (Student) beanFactory.getBean("student");
		
		
		System.out.println(student.toString());
	}

}
