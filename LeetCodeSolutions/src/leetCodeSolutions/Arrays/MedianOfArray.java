package leetCodeSolutions.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfArray {

	public static double findMedian(int[] nums1, int[] nums2) {

		int[] mergeArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();

		Arrays.sort(mergeArray);

		int arrayLength = mergeArray.length;

		if (arrayLength % 2 == 0) {
			return (mergeArray[arrayLength / 2 - 1] + mergeArray[arrayLength / 2]) / 2.0;

		} else {
			return mergeArray[arrayLength / 2];
		}

//		System.out.println(length);
//		System.out.println(Arrays.toString(mergeArray));
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 3, 4 };

		int[] nums2 = { 2 };

		double result = findMedian(nums1, nums2);

		System.out.println(result);

	}
}
