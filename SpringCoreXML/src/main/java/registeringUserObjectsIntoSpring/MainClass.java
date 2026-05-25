package registeringUserObjectsIntoSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainClass {

	private final UserService userService;

	public MainClass(UserService userService) {
		
		this.userService = userService;
		
	}

	public static void main(String[] args) {
		
		SpringApplication.run(MainClass.class, args);
		
	}

	@Bean
	public CommandLineRunner runDemo() {

		return args -> {
			
			System.out.println("Running UserService");
			
			userService.doWork();
		};
	}
}
