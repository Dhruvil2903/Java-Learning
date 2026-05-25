package rechargeApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
//		// this is tightly coupled because the object creation is done by manually.
//		Sim sim = new Jio();
//		
//		sim.calling();
//		sim.data();
		
		// instead of doing the manually object creation implement applicationContext.
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		// get the bean
		Sim sim = applicationContext.getBean("sim" ,Jio.class);
		
		sim.calling();
		sim.data();
	}
}
