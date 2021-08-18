/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package oop;

import java.util.Random;

/**
 *
 * @author kwhil
 */
public class OOP {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/**
		 * The point of this object is to make a random number generator.
		 */
		// when we have the "new" keyword it means a new instance of the 
		// object created.
//		Random rand = new Random();
//		int r = rand.nextInt(6)+1;
//		System.out.println(r);


		Rando rand = new Rando(10, 5);
		System.out.println(rand.getRando());
		
		Rando rand1 = new Rando(100, 90);
		System.out.println(rand1.getRando());

	}

}
