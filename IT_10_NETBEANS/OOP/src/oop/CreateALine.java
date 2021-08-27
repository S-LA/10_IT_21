/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package oop;

/**
 *
 * @author kwhil
 * CreateALine.make(1);
 */
public class CreateALine {
	public static void make(int option){
		
		DrawALine line= new DrawALine(8);
		
		if(option == 1){
			line.printer("#");
		}else if(option == 2){
			line.printer("&");
		}else if(option == 3){
			line.printer("*");
		} else {
			line.printer("?");
		}
	}
	
	public static void makeSwitch(int option){
		
		DrawALine line = new DrawALine(12);
		
		switch(option){
			case 1:
				line.printer("#");
				break;
			case 2:
				line.printer("&");
				break;
			case 3:
				line.printer("*");
				break;
			default:
				line.printer("?");
				break;
				
		}
		
		
	}
	
}
