package leetCodeSolutions.numbers;

public class IntegerToRoman {

	public static String convertIntegerToRoman(int number) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		String result = "";

		for (int i = 0; i < values.length; i++) {
			while (number >= values[i]) {
				result += symbols[i];
				number -= values[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int number = 7;

		String result = convertIntegerToRoman(number);

		System.out.println(result);

	}
}
