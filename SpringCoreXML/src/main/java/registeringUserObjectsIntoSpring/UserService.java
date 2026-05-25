package registeringUserObjectsIntoSpring;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserEntity userEntity;

	public UserService(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	public void doWork() {
		userEntity.getMessage();
	}
}
