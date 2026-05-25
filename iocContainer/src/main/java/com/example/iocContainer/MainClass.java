package com.example.iocContainer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoC.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloServiceAnnotation.class);

		HelloService helloService = applicationContext.getBean(HelloService.class);

		helloService.sayHello();
	}
}
