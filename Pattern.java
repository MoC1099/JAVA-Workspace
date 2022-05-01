package projects;

import java.util.Scanner;


public class Pattern {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How many stars would u want to print?");
		int star = scan.nextInt();
		for (int i=0; i<=star-1; i++) {
			for (int y = 0; y < i; y++) {
				System.out.print("*");
			}
			System.out.println("*");
	}

		for (int i=star-1; i>0; i--) {
			for (int y = 1 ; y < i; y++) {
				System.out.print("*");
			}
			System.out.println("*");

		}
}
}
