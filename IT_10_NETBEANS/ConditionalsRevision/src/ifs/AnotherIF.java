/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package ifs;

/**
 *
 * @author kwhil
 */
public class AnotherIF {

	public static int runthismethod(int val) {
		int x;
		int y = 3;
		x = 4;
		
		char start = 'z';
		val = start;
		while(val != 'a'){
			System.out.println(val--);
		}
		
		int thisanswer = val;
		


		
		if ((x != 5) && y == 3) {
			for (int i = 0; x < 10; i++) {
				System.out.println(i);
				if (i == 6) {
					while (i != 0) {
						System.out.println(i--);
						x++;
						if (i == 0) {
//							System.exit(0);
							x = 11;
						}
					}
				}

			}
		}
		return thisanswer; 
	}

}
