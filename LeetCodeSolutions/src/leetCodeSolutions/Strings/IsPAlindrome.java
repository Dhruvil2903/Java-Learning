package leetCodeSolutions.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsPAlindrome {

	public static boolean isPalindrome(int number) {
		if(number < 0) 
			return false;
		
		int original = number;
		int reversed = 0;
		
			
			while(number > 0) {
				int digit = number % 10;
				reversed = reversed * 10 + digit;
				number = number/ 10;
			
		}
		if(original == reversed) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int number = 121;
		boolean result = isPalindrome(number);
		System.out.println(result);
	}
}
