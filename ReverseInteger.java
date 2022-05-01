package LeetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverse(
				1534236469));
	}

	public static int reverse(int x) {

		long rev = 0;
		
		
		while (x != 0) { 
			int digit = x % 10; // = 123456.6  ===  digit = 6
			rev = rev * 10 + digit;    // 0 x 10 + 6 = 6
			x /= 10;  // now new value of x is 12345
		}
		
		if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
			return (int)rev;
		else 
			return 0;
		
	}
}