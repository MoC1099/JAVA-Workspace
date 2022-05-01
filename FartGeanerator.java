package projects;

import java.util.HashMap;
import java.util.Scanner;

public class FartGeanerator {

	public static void main(String[] args) {
		// use string
		// int
		// hashmaps/ for both string and int
		// print hashmap using that string and int
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first initial of your name and the day of teh month you were born: ");

		String letters = scan.next();

		String p = letters.toUpperCase();
		int numbers = scan.nextInt();

		HashMap<String, String> letter = new HashMap<String, String>();

		letter.put("A", "Loud");
		letter.put("B", "Stinky");
		letter.put("C", "Beautiful");
		letter.put("D", "Hot");
		letter.put("E", "Full");

		HashMap<Integer, String> number = new HashMap<Integer, String>();

		number.put(1, "Powerful");
		number.put(2, "Flat");
		number.put(3, "Horrible");
		number.put(4, "Sturdy");
		number.put(5, "Arrogant");
		number.put(6, "Weak");

		System.out.println("Your fart is the " + letter.get(p) + " and " + number.get(numbers));
	}

}
