package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("HelloWorld.xml");
		
		HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
		
		helloWorld.helloWorld();
		
		
	}
}
