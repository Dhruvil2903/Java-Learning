package arraySorting;



public class SortString {

	public static String sortString(String str) {
		char[] ch = str.toCharArray();
//		
//		Arrays.sort(ch);
//		
//		System.out.println(ch);
		
		int start = 0;
		int end = ch.length -1;
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String str = "Learning";
		
		System.out.println(sortString(str));
	}
}
