package helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Hello implements HelloWorld{

	@Override

	public void hello() {
		System.out.println("Hello");
		
	}

	@Override
	public void bye() {
		System.out.println("Bye");
		
	}

}
@Component
@Primary
class Hey implements HelloWorld{

	@Override

	public void hello() {
		System.out.println("Hello from Hey");
		
	}

	@Override
	public void bye() {
		System.out.println("Bye from Hey");
		
	}
	
}
