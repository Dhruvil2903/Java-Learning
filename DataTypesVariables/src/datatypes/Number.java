package datatypes;

public class Number {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 30;
		int total = 40;
		switch (total) {
		case 1:
			total = number1 + number2;
			System.out.println(total);
		default:
			System.out.println("No numbers please enter valid numbers");
//			System.out.println("Total : " + total);
		}
	}
}
