package projects;

import java.util.Scanner;

public class DateOfBirth {

	static int currentYear = 2021;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("whats your Date of Birth:");
		int Year = scan.nextInt();

		System.out
				.println("If your were born in " + Year + " then your should be " + (currentYear - Year) + " years old.");

	}

}
