package projects;

// this factorial program will be a good example on how we use recursive methods in java
public class FactorialProgram {

	public static void main(String[] args) {

		System.out.println(Factorial(5));
		
		// factorial of 5 will be 5 * 4 *3 *2 *1
	}
	
	public static int Factorial(int n) {
		
		// we need to implement a program where system repeatedly runs program
		// multiple times until we reach 1
		
		if (n == 1) {
			// remember 1 is the base case. if the return =0 then we get zero.
			// so we make return =1
			// if its zero we multiply all factorials from 0 at the end
			// 4! * 0 which will give us 0
			//so thats why we have to make it = 1
			return 1;
		} else {
			
		return n * Factorial(n-1);
			
			}
		
	
		}
		
	
		
	}


