package leetCodeSolutions.numbers;

public class PalindromeNumber {

	public static boolean isPalindromeNumber(int number) {

		if (number < 0 || number % 10 == 0 && number != 0) {
			return false;
		}

		int reversed = 0;

		while (number > reversed) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}
		return number == reversed || number == reversed / 10;

	}

	public static void main(String[] args) {
		int number = -121;

		boolean result = isPalindromeNumber(number);

		System.out.println(result);
	}

}
