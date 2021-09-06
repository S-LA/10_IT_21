package question_2;

/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 * 	TERM TEST THREE
 *  03-09-2021 
 *  ------------------------
package question_two;

/**
 *
 * @author kwhil
 */
public class AlphabetPrintFix {

	public static void run() {
		int loops = 0;
		char x = 9_7;
		char y = 0x61;
		int counter = loops;
		boolean new_line;
		int Current = y;
		while (Current != 0b1000001 ) {
			counter++;
			x++;
			y--;
			String print1 = Integer.toString(x);
			System.out.print(print1);
			String print2 = Integer.toString(y);
			System.out.print(print2);
			System.err.print(" ");
			new_line = counter % 5 == 0;
			if (new_line) {
				System.out.println();
			}
			Current = counter; 
		}
	}
}



