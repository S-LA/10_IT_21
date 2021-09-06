/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package conditionalsrevision;

/**
 *
 * @author kwhil
 */
public class EvenFor {
	/**
	 * Create a method called ConsolePrint(int param)
	 * Use a for loop in the method to print all the even
	 * numbers between zero and param.
	 */	
	public static void consolePrint(int param){
		for(int i = 0; i <= param; i++){
			System.out.println(i++);
		}
	}	
	public static void anotherPrint(int param){
		for(int i = 0; i <= param ; i++){
			int check = i;
			int mod = check%2;
			if(mod == 0){
				System.out.println(check);
			}	
		}	
	}
	
	
}









