package leetCodeSolutions.numbers;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static String convertRomanToInteger(String name) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('X', 10);
		
		return "-1";
	}
	public static void main(String[] args) {
		String name = "XL";
		
		String result = convertRomanToInteger(name);
		
		System.out.println(result);
	}
}
