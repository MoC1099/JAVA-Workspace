package projects;

import java.util.ArrayList;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		
		System.out.println(PrimeNums(1, 100));
		
	}
		public static ArrayList<Integer> PrimeNums(int start, int end) {
			ArrayList<Integer> primes = new ArrayList<Integer> ();
			
			
			
			
			
			for(int i = start; i<end; i++) {
				
				boolean prime = true;
				int x = 2;
				
				while (x <= i/2) {
					if (i%x == 0) {
						prime = false;
						break;
					}
					x++;
				}
				
				if(prime) {
					primes.add(i);
				}
			}
			
			return primes;
			
		}
		
	
}
