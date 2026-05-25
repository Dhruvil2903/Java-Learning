package SpringStraightValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		//Xml Config
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("StreightValue.xml");

		UserDao dao = applicationContext.getBean("userDao", UserDao.class);

		dao.testConnection();
		
//		Java Based config
//
//		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
//
//		UserDao dao2 = applicationContext2.getBean( UserDao.class);
//
//		dao2.testConnection();

	}
}
