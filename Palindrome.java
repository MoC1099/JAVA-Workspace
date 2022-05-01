package projects;

public class Palindrome {

	public static void main(String[] args) {

		// mom, dad, poop

		String Orignal = "bob";
		String reverse = "";

		// plaindroms are if a word is same if we were to read it backwords.

		// now we copy pasted this method from reverseString class
		// this for loop will start reading from i the very end of the word
		for (int i = Orignal.length() - 1; i >= 0; i--) {
			// it will store each character it reads into a reverse string
			reverse += Orignal.charAt(i);

			// it will print each character it stores in the reverse
			System.out.println(reverse);
		}

		// setting true
		boolean palindrome = true;

		// this will read orignal word from strat and them compare each character with
		// the reverse characters we did before.
		for (int i = 0; i < Orignal.length(); i++) {

			// if the orignal string characters are different then the reverse string
			// characters then palindrome is false.
			if (Orignal.charAt(i) != reverse.charAt(i)) {
				palindrome = false;

			}

		}
		if (palindrome) {
			System.out.println("The word " + Orignal + " is a palindrome");

		} else {
			System.out.println("Its not a plaindrome.");
		}
	}

}
