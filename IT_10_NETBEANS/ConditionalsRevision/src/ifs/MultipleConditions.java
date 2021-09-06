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
		 * When you want to do decide something based on more than one condition.
		 */
		boolean raining = true;
		boolean cold = true;
		int time = 22;	//time in 24H
		String day = "monday";
//		String mon = "MoNdAy";
		/*
			Decision helper.
		 */
		if (day.equals("sunday") || day.equals("saturday")) {
			System.out.println("YAY!");
			if(time > 6 && time < 19){// checks day
				System.out.println("Its the day");
				if(time < 12){
					System.out.println("moring");	
				} else {
					System.out.println("afternoon");
				}
			} else {
				System.out.println("night");
			}	
		} else {
			System.out.println("GO TO SCHOOL");
			if(cold && !raining){
				System.out.println("Take jacket");	
			} else if (raining){
				System.out.println("umbrella");
			} 
		}
		

//		// to check that both conditions	
//		// are true we use <&&>
//		if (raining == true & cold == true) {
//			System.out.println("Take raincoat");
//		}
//		// to check if only one of the condions is
//		// true we can use the <||> pipe means or.
//		if (raining == true | sunshine == true) {
//			System.out.println("Take umbrella");
//		}
	}
}
