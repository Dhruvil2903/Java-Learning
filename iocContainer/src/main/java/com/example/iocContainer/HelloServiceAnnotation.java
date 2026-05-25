package com.example.iocContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloServiceAnnotation {

	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
