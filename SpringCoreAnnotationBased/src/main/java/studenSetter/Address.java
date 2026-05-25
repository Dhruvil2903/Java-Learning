package studenSetter;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;
	
	public Address() {
		this.city = "Gandhingar";
		this.state = "Gujarat";
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}

}
