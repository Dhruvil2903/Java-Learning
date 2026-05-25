package com.example.iocContainer.lifeCyclePreview;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		MangoService mangoService = applicationContext.getBean("mangoService", MangoService.class);
		
		mangoService.serve();
		
		applicationContext.close();
	}
}
