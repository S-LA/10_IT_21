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
		char x = 97;//'a'
		char y = 65; 
		for(int i = 1; i <= 26; i++){
			System.out.print(Character.toString(x++) +  Character.toString(y++) + " " );
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}



