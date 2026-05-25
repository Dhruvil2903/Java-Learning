package leetCodeSolutions.Strings;

public class PalindromicSubstring {

	public static String longestPalindromeSubstring(String s) {
		if (s == null || s.length() < 1)
			return "";
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {

			int len1 = expandAroundCenter(s, i, i);

			int len2 = expandAroundCenter(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > end - start) {
				start = i - (len - 1) / 2;

				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);

	}

	public static int expandAroundCenter(String s, int end, int start) {

		while (end >= 0 && start < s.length() && s.charAt(end) == s.charAt(start)) {
			end--;
			start++;
		}
		return start - end - 1;
	}

	public static void main(String[] args) {
		String s = "Hello";

		String result = longestPalindromeSubstring(s);
		
		System.out.println(result);
	}
}
