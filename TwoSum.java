package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// HashSet is a set, e.g. {1,2,3,4,5}
//HashMap is a key -> value (key to value) map, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}
//Notice in my example above that in the HashMap there must not be duplicate keys, but it may have duplicate values.
//In the HashSet, there must be no duplicate elements.

	public static void main(String[] args) {
		TwoSum.twoSum(new int[] { 6, 2, 4, 5 }, 10);
	}

	// This is an easy apprach that take more time complexity, if you want a faster
	// out put use hasmaps
	// public static int[] twoSum(int[] nums, int target) {
//
//	        int[] a = new int[]{-1,-1};
//	        for(int i=0;i<nums.length-1;i++){
//	            for(int j=i+1;j<nums.length;j++){
//	                if(nums[i]+nums[j]==target){
//		              System.out.print(a[0]=i );
//		              System.out.println(a[1]=j);
//	                    break;
//	                }
//	            }
//	        }
//	        return a;
//	}

	public static int[] twoSum(int[] nums, int target) {
		// <Key, Value>
		HashMap<Integer, Integer> in_map = new HashMap<>(); // creting new hashMap to store values
		int complement = 0;
		for (int i = 0; i < nums.length; i++) { // iteratoing through the given array
			complement = target - nums[i]; // saying that comlement = the target = 10 - values of the current i in
											// nums[i]; 4

			if (in_map.containsKey(complement)) { // if such complemet exists in the given array of values (in this case
													// 4)
				System.out.print(i + 1 + ","); // we print the index of that value i +1 = 3
				System.out.println(in_map.get(complement)); // print the index of complement in in_map = 0
				return new int[] { in_map.get(complement), i }; // return the same thing

			}
			in_map.put(nums[i], i); // once done finding, add in_map hashset the values nums[i] and i;
			// System.out.println(nums[i]+ i);
			// nums[i] = 6 , 4

		}

		throw new IllegalArgumentException("No match found!");

	}

}
