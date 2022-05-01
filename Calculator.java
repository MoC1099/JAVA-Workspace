package projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter numbers and tell use what method you want to perform on them");
		// Calculations(1, 2);
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("What kinf of function would you like to perform: ");

		String f = scan.next();
		String add = "+";
		String sub = "-";
		String div = "/";
		String mul = "*";

		if (f.endsWith(add)) {
			System.out.println(a + b);
		} else if ((f.endsWith(sub))) {
			System.out.println(a - b);
		} else if ((f.endsWith(div))) {
			System.out.println(a / b);
		} else if ((f.endsWith(mul))) {
			System.out.println(a * b);
		}

	}

}
