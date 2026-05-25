package leetCodeSolutions.numbers;

public class ReverseInteger {

	public static int reverseInteger(int x) {

		int reversed = 0;

		while (x != 0) {
			int digit = x % 10;
			x /= 10;

			if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && digit > 7) {
				return 0;
			}
			if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && digit < -8) {
				return 0;
			}
			reversed = reversed * 10 + 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		int x = 123456789;
		
		int result = reverseInteger(x);
	
		System.out.println(result);
	}
}
