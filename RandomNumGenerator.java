package projects;

import java.util.Random;

public class RandomNumGenerator {
// in this java program we will be implemeting code for a dice.

	public static void main(String[] args) {
		Random r = new Random();

		int x = r.nextInt(6) + 1;
		System.out.println(x);

		String c = "hello my name is saad";
		// first we selected the substring of "h" made it uppercase and then added the
		// substring continuing from 1
		String selection = (c.substring(0, 1).toUpperCase() + c.substring(1));
		System.out.println(selection);
	}

}
