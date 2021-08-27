/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package oop;

import javax.swing.JOptionPane;

/**
 *
 * @author kwhil
 */
public class LetterGrade {
	/**
	 *  Take a mark (percentage) and convert it to a .........
	 *	LETTER GRADE
	 *	100 - 80     = A
	 *	70  - 79.99  = B
	 *	60  - 69.99  = C
	 *	50  - 59,99  = D
	 *	40  - 49,99  = E
	 *	0   - 39,99  = F
	 */
	
	public static void run(){
		
		int mark;
		int markDiv10;
		char grade=' ';
		
		mark = Integer.parseInt(JOptionPane.showInputDialog("mark"));
//		mark = 89;
		markDiv10 = mark /10;
		System.out.println(markDiv10);
			
		
		
		switch(markDiv10){
			case 10:
			case 9:
			case 8:
				grade = 'A';
				break;
			case 7:
				grade = 'B';
				break;
			case 6:
				grade = 'C';
				break;
			case 5:
				grade = 'D';
				break;
			case 4:
				grade = 'E';
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				grade = 'F';
				break;
		}
		
		System.out.println(grade);
		
	}
}
