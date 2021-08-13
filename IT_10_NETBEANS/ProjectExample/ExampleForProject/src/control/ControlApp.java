/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package control;

//import maths.FullOOP;

import files.ReadingTheFile;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import maths.MathsStuff;

/**
 * @author kwhil
 */
public class ControlApp {

	public static void main(String[] args){
		
		try {
			ReadingTheFile.go(null);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ControlApp.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("Type the words:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Upper (t) or lower (f)");
		Scanner scan2 = new Scanner(System.in);
		boolean ulcase = scan2.nextBoolean();
		
		//boolean ulcase = true;
		if (ulcase) {
			System.out.println(MathsStuff.makeupper(str));
		} else {
			System.out.println(MathsStuff.makelower(str));
		}
		
		scan.close();
		scan2.close();
		
		
	}
}
