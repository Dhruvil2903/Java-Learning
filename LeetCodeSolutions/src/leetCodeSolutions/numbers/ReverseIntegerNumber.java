package leetCodeSolutions.numbers;

public class ReverseIntegerNumber {

	public static int reverseIntegerNumber(int number) {

		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;

			number /= 10;


			if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && digit > 7)
				return 0;
		
			if(reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && digit < -8 ) 
				return 0;
			reversed = reversed * 10 + digit;
		}
		return reversed;

	}

	public static void main(String[] args) {
		int number = -2147483412;

		int result = reverseIntegerNumber(number);

		System.out.println("The result is : " + result);
	}

}
