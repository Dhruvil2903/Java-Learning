package helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DriverClass {

	@Autowired
//	@Qualifier("hey") // if i use hello then it will access methods of hello class, if hey then it's method
	private HelloWorld helloWorld;
	
	public void useHello() {
		helloWorld.hello();
		helloWorld.bye();
	}
	public static void main(String[] args) throws Exception {
		// Loading the Spring XML configuration
		// file into the spring container and
		// it will create the instance of
		// the bean as it loads into container
	//{  This is XML level Configuration	
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		// HelloWorld helloWorld = applicationContext.getBean("h", HelloWorld.class); }
		
		
		
	//{ This is java-based configuration
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//		// It will close the spring container
//		// and as a result invokes the
//		// destroy() method
//		HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
//		
//		helloWorld.hello();
//		helloWorld.bye(); }
		
	// Annotation-based configuration
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DriverClass driverClass = applicationContext.getBean(DriverClass.class);
		
		driverClass.useHello();
		
	}
}
