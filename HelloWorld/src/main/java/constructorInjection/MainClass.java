package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructorInjection.xml");

		ConstructorInjection constructorInjection = applicationContext.getBean("ci", ConstructorInjection.class);

		System.out.println(constructorInjection.toString());

	}
}
