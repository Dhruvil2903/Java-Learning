package arraySorting;

public class SortBinaryArray {

	public static void sortBinaryArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			
				if(start < end) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
				}
				start++;
				end--;
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 0, 1, 0, 1, 0 };

		sortBinaryArray(arr);
	}
}
