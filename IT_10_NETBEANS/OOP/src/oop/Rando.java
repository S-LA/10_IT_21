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
public class Rando {
	
	/**
	 *  When creating an object we do not put a main method.
	 *  Instead of the main method we make a constructor.
	 *  a constructor is quite a basic "keyworded" thing.
	 */
	public Rando(int inMax, int inMin){
		max = inMax;
		min = inMin;
	}
	/**
	 * we can then set variables to be used in the object.
	 * if we do not need to access the variables from another
	 * class we can define them as privates.
	*/
	private int max; // these values have been declared, not initilised
	private int min;
	
	public int getRando(){
		Random rand = new Random();
		int mx = max-min+1;
		int mn = min;
		int val = rand.nextInt(mx)+mn;
		return val;
	}

	
	
}
