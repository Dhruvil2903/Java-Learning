package car;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private int id;
	
	
	public Engine() {
		this.name = "BMW";
		this.id = 1;
	}
	
	public void engineDetails() {
		System.out.println("This is engine method "+ name +" " + id);
	}
}
