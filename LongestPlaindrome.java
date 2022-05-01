package LeetCode;

public class LongestPlaindrome {
// we are looking for the longest plaindrome

	public static void main(String[] args) {
		System.out.println(LongestPlaindrome.longestPalindrome("avccbbb"));

	}
	static int lo = 0;
	static int maxLen = 0;


	public static String longestPalindrome(String s) {
		int len = s.length();
		
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	    	
	    	//abccb
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	
	     	//abccba
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private static void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			System.out.print("This is J: " + s.charAt(j));
			System.out.print(" This is K: " + s.charAt(k));
			System.out.println();
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
		
	}
}
