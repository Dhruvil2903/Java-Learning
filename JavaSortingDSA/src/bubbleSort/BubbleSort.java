package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		int passCount = 0;
		int swapCount = 0;
		for (int i = 0; i < arr.length; i++) {
			passCount++;
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				int prev = arr[j];
				int next = arr[j + 1];
				if (prev > next) {
					swap(arr, j, j + 1);
					swapCount++;
					swapped = true;

				}
			}
		}

		System.out.println("Passed Count :" + passCount);
		System.out.println("Swapped Count : " + swapCount);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 10, 2, 9, 8, 7 };
		System.out.println("Before : " + Arrays.toString(arr));
		bubbleSort(arr);

		System.out.println("After : " + Arrays.toString(arr));
	}
}
