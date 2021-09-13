/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package question_3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kwhil
 */
public class GuessTheNumber {

	public static void run() {
		Random rand = new Random();
		int secret = rand.nextInt(9) + 1;
		System.out.println("Choose A number between 1 and 10");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();

		if (guess == secret) {
			int points = 10;
			System.out.println("You got " + points + " points");
		} else if (guess != secret) {
			boolean correct = false;
			int points = 10;
			while (correct != true) {
				if (points == 0) {
					System.out.println("You have 0 points");
				} else {
					System.out.println("Choose a number");
					guess = scan.nextInt();
					if (guess == secret) {
						correct = true;
						System.out.println("You got " + points + "points");
					} else {
						points = points - 1;
					}
				}
			}
		}
	}
}
