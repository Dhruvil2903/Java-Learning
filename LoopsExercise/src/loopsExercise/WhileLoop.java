package loopsExercise;

public class WhileLoop {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			if (number % 2 == 0) {
				System.out.println("Even numbers are : " + number);
				
			}
			number++;
		}
	}
}
