package projects;

import java.util.Random;

public class FortuneCookies {

	public static void main(String[] args) {
		
		
		String[] randomFortuneCookie = {"You will be successful soon, just be paitent", "Keep calm and take the risk" ,
				"Your Family is your everything", "Do what excites",  "Soon you will be living your best life",
				"Do what you like", "Be positive"};
		
		Random rand = new Random();
		
		int r = rand.nextInt(randomFortuneCookie.length);
		System.out.println(randomFortuneCookie[r]);
				
		
	}	
}
