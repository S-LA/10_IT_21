/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package oop;

import java.math.BigInteger;

/**
 *
 * @author kwhil
 */
public class BigNumbers {

	public static void run(){

			// get user input		 
		String firstInput = "123458359574597348579437598345347588587345734759347598359873957395435875978947593475983475983475983475983759348574375983758934574857345837594759835703759847598578375987598374598734753475834759847598375837589375988734573759837593589498573857983475934534759874579375983475983475834593475987459834759847598375947543578475387598347589745793759875894759837598357347547598758937435734953879835758395984759837589459349756";
		String secondInput = "26667596598435893459863456345678658934659834659834659346598345983498563495636589346598346598346589346593465934659345934756385686573467556475639563456495642965293659236597326587326574659765784658736597398573857985939356934657365359865964956865983659349569563664";
		
		BigInteger val1 = new BigInteger(firstInput);
		BigInteger val2 = new BigInteger(secondInput);
		BigInteger val3 = val1.multiply(val2);
		System.out.println("Sum of val1 and va2="+val3);
		
		
		
	}
	
}
