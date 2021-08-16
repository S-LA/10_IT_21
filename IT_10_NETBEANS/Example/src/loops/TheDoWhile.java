/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package loops;

import javax.swing.JOptionPane;

/**
 *
 * @author kwhil
 */
public class TheDoWhile {

	public static void intro() {
		System.out.println("The do while is used when\n"
				+ "you want to definatly run some thing"
				+ "once and then check for conditions.");
		int num = 2;
		String password = "";
		do {
			password = JOptionPane.showInputDialog("Password");
		} while (!password.equals("abc"));
		System.out.println("Yes that works");
	}
}
