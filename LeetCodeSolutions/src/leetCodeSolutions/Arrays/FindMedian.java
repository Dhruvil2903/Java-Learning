package leetCodeSolutions.Arrays;

public class FindMedian {

	public static double findMedian(int[] num1 , int[] num2) {
		 if (num1.length > num2.length) {
	            return findMedian(num2, num1);
	        }
		int m = num1.length;
		int n = num2.length;
		int start = 0;
		int end = m;
		
		while(start <= end) {
			int partitionX = (start + end) /2 ;
			int partitionY = (m + n + 1) / 2 - partitionX;
			
			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : num1[partitionX -1];
			int minRightX = (partitionX == 0) ? Integer.MIN_VALUE : num1[partitionX ];
			
			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : num2[partitionY-1];
			int minRightY = (partitionY == 0) ? Integer.MIN_VALUE : num2[partitionY];
			
			if(maxLeftX <= minRightY && maxLeftY <= minRightX ) {
				if((m + n) % 2 == 0) {
					  return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    // Odd total length
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // Move left in nums1
                end = partitionX - 1;
            } else {
                // Move right in nums1
                start = partitionX + 1;
            }
        }

        // If input arrays are not sorted or invalid
        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedian(nums1, nums2);
        System.out.println("Median is: " + median);
    }

}
