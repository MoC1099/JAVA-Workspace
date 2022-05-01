package projects;

import java.util.Random;
import java.util.Scanner;

public class TypingSpeed {
	static int minute = 60;
	static String[] s = { "Hello ", "Butterfly ", "Computer ", "Microphone ", "Speeddial ", "Family ", "playground ",
			"vacation ", "fun " };

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start typing in: ");
		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("2");
		Thread.sleep(1000);

		System.out.println("3");
		Thread.sleep(1000);

		System.out.println("Gooooo!!!!.... ");

		Scanner scan = new Scanner(System.in);

		WPM();
		System.out.println();
		long timeStart = System.currentTimeMillis();
		String typedWords = scan.next();
		long timeEnd = System.currentTimeMillis();

		long TotaltimeTaken = timeEnd - timeStart;
		int p = (int) (TotaltimeTaken / 1000);
		System.out.println("It took you " + p + " seconds" + " to finish the task");

		int NumberfWords = typedWords.length();

		int WordsPerMin = (int) ((((double) NumberfWords / 5) / p) * 60);
		System.out.println("Your WPM is: " + WordsPerMin);
	}

	public static void WPM() {
		Random rand = new Random();
		for (int i = 0; i < s.length; i++) {

			String NumberofWords = (s[rand.nextInt(s.length)]);

			System.out.print(NumberofWords);

		}

	};

	public static void WordsPerMin() {

	}

}
