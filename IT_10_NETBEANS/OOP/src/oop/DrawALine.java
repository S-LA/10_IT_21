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
public class DrawALine {

	/**
	 * Create an object class with a constructor that will allow you to set the
	 * length of the line, the length should be saved as a private int. Then
	 * make a method that will take an input of a symbol to print the amount of
	 * times declared in the constructor.
	 */
	//Variables
	private int lineLen = 0;
	private String symbol = "";

	// Constructors
	public DrawALine(int len) {
		lineLen = len;
	}

	public DrawALine(String sym, int len) {
		symbol = sym;
		lineLen = len;
	}

	//methods
	public void printer(String sym) {
		symbol = sym;
		for (int i = 0; i < lineLen; i++) {
			System.out.print(symbol);
		}
		System.out.print("\n");
	}

	public void printer() {
		for (int i = 0; i < lineLen; i++) {
			System.out.print(symbol);
		}
		System.out.print("\n");
	}

}
