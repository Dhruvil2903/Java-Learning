package com.example.iocContainer.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");

		System.out.println("---- Singleton Scope ----");
		MangoService s1 = context.getBean("singletonMango", MangoService.class);
		MangoService s2 = context.getBean("singletonMango", MangoService.class);
		s1.serve();
		s2.serve();
		System.out.println("s1 == s2 ? " + (s1 == s2));

		System.out.println("---- Prototype Scope ----");
		MangoService p1 = context.getBean("prototypeMango", MangoService.class);
		MangoService p2 = context.getBean("prototypeMango", MangoService.class);
		p1.serve();
		p2.serve();
		System.out.println("p1 == p2 ? " + (p1 == p2));

		context.close();

	}
}
