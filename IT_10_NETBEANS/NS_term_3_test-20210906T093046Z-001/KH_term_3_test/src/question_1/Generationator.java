/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 * 	TERM TEST THREE
 *  03-09-2021 
 *  ------------------------
 */
package question_1;

/**
 *
 * @author
 */
public class Generationator {

	public static int testage = 26;

	public static String fromAge(int currentAge) {
		int thisYear = 2021;
		int yob = 2021 - currentAge;

		String genz = "Gen Z";
		String mil = "Millenials";
		String genx = "Gen X";
		String boom = "Boomers";
		String silent = " Silent";
		String result = "";

		if (yob <= 2012 && yob >= 1997) {
			result = genz;
		} else if (yob <= 1996 && yob >= 1981) {
			result = mil;
		}else if (yob <= 1980 && yob >= 1965) {
			result = genx;
		} else if (yob <= 1964 && yob >= 1946) {
			result = boom;
		} else if (yob <= 1945 && yob >= 1928) {
			result = "Too old";
		}

		return result;
	}

}
