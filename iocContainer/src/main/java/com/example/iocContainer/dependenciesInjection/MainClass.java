package com.example.iocContainer.dependenciesInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Ci.xml");

//		FruitBasket basket = applicationContext.getBean("basket1", FruitBasket.class);
//
//		basket.showFruit();
//
//		FruitBasket basket2 = applicationContext.getBean("basket2", FruitBasket.class);
//
//		basket2.showFruit();
//
		FruitBasket basket3 = applicationContext.getBean("basket3", FruitBasket.class);

		basket3.showFruit();

		applicationContext.close();
	}
}
