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
public class NumberLine {
	
	// var
	private int maxNum = 0;
	
	// constructor
	public NumberLine(int input){
		maxNum = input;
	}
	
	// methods
	public void positive(){
		for(int i = 0 ; i <= maxNum;i++){
			System.out.print(i + ", ");
		}
		System.out.println("");
	}
	
	public void negative(){
		int maxNeg = -1*maxNum;
		for(int i = 0; i >= maxNeg; i--){
			System.out.print(i + ", ");
		}
		System.out.println("");
	}
	
	
	
}










