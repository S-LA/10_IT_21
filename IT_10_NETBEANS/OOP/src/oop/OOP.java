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

		/*
		Rando rand = new Rando(10, 5);
		System.out.println(rand.getRando());
		
		Rando rand1 = new Rando(100, 90);
		System.out.println(rand1.getRando());
		 */
		
		/*
		DrawALine line = new DrawALine(5);
		line.printer("#");
		line.printer("&");
			
		DrawALine line2 = new DrawALine("*", 10);
		line2.printer();
		*/
		
		/**
		 * make an object that will take a single parameter.
		 * Call it NumberLine, the aim is to print the numbers
		 * between 0 and the number input as a parameter in the object 
		 * declaration. And then make two methods, one will print in the 
		 * positive and the other in the negative direction.
		 */
		NumberLine numline = new NumberLine(5);
		numline.positive();
		numline.negative();
		numline.positive();

		
		
		
	}

}
