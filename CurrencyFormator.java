package projects;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		
		
		//write your code
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en" , "in")).format(payment);

		String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("CHINA: " + China);
		System.out.println("FRANCE: " + France);
	}
	


}
