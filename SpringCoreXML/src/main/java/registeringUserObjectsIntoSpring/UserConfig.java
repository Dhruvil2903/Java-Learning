package registeringUserObjectsIntoSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

	@Bean
	public UserEntity userEntity() {
		return new UserEntity(); // Spring will manage this bean
	}
}
