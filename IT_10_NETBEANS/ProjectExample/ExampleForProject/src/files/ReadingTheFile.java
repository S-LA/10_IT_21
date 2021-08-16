/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kwhil
 */
public class ReadingTheFile {
	
	public static void go(String[] args) throws FileNotFoundException{
		File f = new File("src//files//example.txt");
		Scanner s = new Scanner(f);
		
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
	}
}







