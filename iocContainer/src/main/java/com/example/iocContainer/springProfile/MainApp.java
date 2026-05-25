package com.example.iocContainer.springProfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext();
		
		applicationContext.getEnvironment().setActiveProfiles("prod");
		
		applicationContext.setConfigLocation("springProfile.xml");
		
		applicationContext.refresh();
		
		Object object = applicationContext.getBean("dataSource");
		
		System.out.println("Active DataSource Bean: " + object.getClass().getSimpleName());
		
		applicationContext.close();
		
		
	}
}
