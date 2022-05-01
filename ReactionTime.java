
package projects;

import java.util.Scanner;

//thread.sleep();
//System.currentTimeMills():
public class ReactionTime {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1");
		//delay of one sec and them move onto the next command
		Thread.sleep(1000);
		
		
		System.out.println("2");
		Thread.sleep(1000);

		System.out.println("3");
		Thread.sleep(1000);

		System.out.println("GO!!!!!!!!!");

		// now we need to start the timmer
		// after the timmer start user has to hit a any key
		
		long timeStart = System.currentTimeMillis();
		
		// now we need scanner to scan the character we enter
		Scanner scan = new Scanner (System.in);
		scan.next();
	
		
		long timeStop = System.currentTimeMillis();
		
		long totalTime = timeStop - timeStart ;
		
		System.out.println(totalTime +"ms");
		
	}

}
