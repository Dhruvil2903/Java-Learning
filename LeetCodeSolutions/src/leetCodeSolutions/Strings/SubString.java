package leetCodeSolutions.Strings;

import java.util.HashSet;
import java.util.Set;

public class SubString {
	public static int lengthOfLongestString(String s) {
		int start = 0;
		int end = 0;
		
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			while(set.contains(ch)) {
				set.remove(s.charAt(start));
				start++;
			}
			set.add(ch);
			end = Math.max(end, i - start + 1);
		}
		return end;
		
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		int result = lengthOfLongestString(s);
		System.out.println(s.substring(0,3));
	}
}
