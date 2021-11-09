/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package goggatest;

import it.*;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author kwhil
 */
public class GoggaTest
{

	/**
	 * @param args the command line arguments
	 */
	public static void movebug(Gogga abug, int spaces) {
		for (int i = 0; i < spaces; i++) {
			abug.move();
		}
	}
	
	public static void movebug(Gogga abug, Gogga bbug, int spaces) {
		for (int i = 0; i < spaces; i++) {
			abug.move();
			bbug.move();
		}
	}
	
	public static void turnOpp(Gogga abug) {
		int dirNow = abug.getDirection();
		int dirDelta = 0;
		System.out.println(dirNow);
		if (dirNow == 1) {
			dirDelta = 2;			
		} else if (dirNow == 2) {
			dirDelta = 1;	
		} else if (dirNow == 3) {
			dirDelta = 4;	
		} else if (dirNow == 4) {
			dirDelta = 3;	
		} else {
			System.out.println("No valid direction!");			
		}		
		abug.setDirection(dirDelta);
	}
	public static boolean checkBoundary(Gogga abug, int x_max, int y_max){
		boolean hit = false;
		int x_pos = abug.getXPos();
		int y_pos = abug.getYPos();
//		int dir = abug.getDirection();

		if(x_pos== 0 || y_pos == 0){
			hit = true;			
		} else if ( x_pos == x_max-1){
			hit = true;
		} else if ( y_pos == y_max-1){
			hit = true;
		} 
			
		return hit;
	}	
	
	public static boolean randomStepBounded(Gogga abug, int x_max, int y_max){
		boolean hit;
		randomMovement(abug, 1);
		hit = checkBoundary(abug, x_max, y_max);
		return hit;
	}
	
	public static void randomMovement(Gogga abug, int moves) {
		
		Random rand = new Random();
		for (int i = 0; i < moves; i++) {			
			int r = rand.nextInt(4) + 1;
			abug.setDirection(r);
			abug.move();			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO code application logic here

	
		
	}
	
}
