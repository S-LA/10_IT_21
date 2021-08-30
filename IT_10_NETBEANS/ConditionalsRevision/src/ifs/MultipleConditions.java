/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package ifs;

/**
 *
 * @author kwhil
 */
public class MultipleConditions {

	public static void basics() {
		/**
		 * When you want to do decide something based on more than one
		 * condition.
		 */
		boolean raining = true;
		boolean cold = false;
		boolean sunshine = false;
		int time = 12;//24 hour time.
		String day = "monday";

		// to check that both conditions	
		// are true we use <&&>
		if (raining == true & cold == true) {
			System.out.println("Take raincoat");
		}
		// to check if only one of the condions is
		// true we can use the <||> pipe means or.
		if (raining == true | sunshine == true) {
			System.out.println("Take umbrella");
		}
	}
}
