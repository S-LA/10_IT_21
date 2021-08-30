/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package oop;

/**
 *
 * @author kwhil
 */
public class MoreSwtiches {
	
	public static void run(){
		/**
		 * Things that cannot be done in switch case
		 *	- you cannot do relational statements
		 * 	- your cannot use double
		 */
		
		int val = 6;
//		double val = 3.4;	
		String word = "word";
		switch(val){
			case 6: 
				System.out.println("jeff");
		}
		
		double val2 = 3.4;
		// you should never compare doubles in a if
		// due to rounding.
		if(val2==val){
			System.out.println("again");
		}
		

		
		
		
	}
}
