package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatingChars {
// this program will work on iterating through the list finding for longest
	// substring without repeating characters
	// we will use hash maps.
	public static void main(String[] args) {

		System.out.println(NoRepeatingChars.LongestChars("abcdeefghi"));
	}

	public static int LongestChars(String s) {

		int i = 0, j = 0, max = 0;
		Set<Character> set = new HashSet<>();
		// in the begining set is empty
		// when ever it find a similar char it basically starts removing chars from the
		// begining of the set
		// and evenetually comes to a point where all chars a removed and the
		// a new set starts and starts buling all unique chars until the same things
		// happens
		// while this process is happening we have a max variable that only calculates
		// the max, stores the value and give us that value at the end.

		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j)); // abcz in the set
				System.out.print(set);
				j++;

				max = Math.max(set.size(), max); // we update the max, with whatever the hashset size is with the
													// current max
				System.out.println(max);
			} else {
				// else we start removing chars frrom the first char
				// System.out.println(s.charAt(i));
				set.remove(s.charAt(i));
				// System.out.println(s.charAt(i));
				i++;
			}
		}
		return max;

	}

}
