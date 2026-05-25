package oopsProgramming.encapsulation;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("Hyundai" , "Elantra" , 24000.00);
		
		// no need to call .toString method because car will call automatically internally.	
		System.out.println(car);
	}
}
