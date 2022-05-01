package projects;

import java.util.Scanner;

public class PredictSubs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//the formula we will be using to calculate the growth rate is y = a(1+r)^x
		System.out.println("Please enter the number of subscribers you currently have: ");
		int  a = scan.nextInt();
		System.out.println("What is the growth rate of your channel");
		float r = (1 + scan.nextFloat());
		
		
		System.out.println("Enter the time interval in days");
		int x = scan.nextInt();
		
		

		System.out.print("Your channel growth within next " + x + " will be: ");
		System.out.println(a * Math.pow(r, x));
		
		
		

	}

}
