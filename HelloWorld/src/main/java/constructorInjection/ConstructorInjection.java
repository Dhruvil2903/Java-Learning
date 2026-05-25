package constructorInjection;

public class ConstructorInjection {

	private String name;
	private int number;

	public ConstructorInjection(String name, int number) {

		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {

		return "Name : " + name +"  " + "Number : " + number;
	}
}
