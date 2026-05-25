package registeringUserObjectsIntoSpring;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBeanRegister {

	private final ApplicationContext applicationContext;

	public UserBeanRegister(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Bean
	public CommandLineRunner registerUserBean() {
		return args -> {
			UserEntity userEntity = new UserEntity();


			DefaultListableBeanFactory beanFactory2 = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();

			beanFactory2.registerSingleton("userEntity", userEntity);// now the bean is registered once so it is cached and second time it will give an error.

			System.out.println("Dao registered manually");

		};
	}

}
