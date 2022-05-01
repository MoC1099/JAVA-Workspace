package projects;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(PrimeNums(1, 100));

	}

	public static ArrayList <Integer> PrimeNums(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		
		
		
		for (int n = start; n < end; n++) {
			 
		boolean prime = true;
		int i = 2;
		while (i <= n/2) {
			
			 if (n % i == 0) {
				 prime = false;
				 break;
			 }
			i++; // we want i to keep increasing to we incremt it 
		}
			 if (prime) {
				 primes.add(n);
				 
			 }
			
		}
		
		// it will ereturn primes which will be automatically stored in the PrimeNums array
		return primes;
	}
}
