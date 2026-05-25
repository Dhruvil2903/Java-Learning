package helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "helloWorld")
public class AppConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new Hello();
	}
}
