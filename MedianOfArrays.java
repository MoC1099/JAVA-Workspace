package LeetCode;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class MedianOfArrays {
// in this program we will be combining two arrays and sort them.
	// then we will find their median
	// median = n+1/2
	public static void main(String[] args) {

		MedianOfArrays.findMedianSortedArrays(new int[] {1,2}, new int[] {3,4});

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		DecimalFormat df = new DecimalFormat("0.00000");
		// lets create a new array that will combine both num1 and nums2 arrays
		int count = 0;
		int[] nums3 = new int[nums1.length + nums2.length];
		
		// this will merge both arrays nums1 and nums2 in nums3
		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
			count++;
		}
		for (int j = 0; j < nums2.length; j++) {
			nums3[count++] = nums2[j];
		}

		Arrays.sort(nums3);
		for (int i = 0; i < nums3.length; i++)
			System.out.print(nums3[i] + " ");
		System.out.println();
			
		// algorithm to find out the median
		double median =0;
		median= (double)(nums3.length + 1) / 2;
		
		//String formatted = df.format(median);
	
		System.out.println(median);
		return (double)(nums3.length + 1) / 2;
		
		
		

	}
}
