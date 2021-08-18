/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package methods;

/**
 *
 * @author kwhil
 */
public class Methods {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/**
		 * Methods in Java are basically functions in other languages.
		 * These are external little pieces of code that perform a specific 
		 * function.
		 * We can create methods with the same name but different parameters.
		 * The compiler will then choose which method should be used, this 
		 * is called method overloading.
		 */
		methodA(2);
		methodA('2');
		int valA = sum(3,4);
		int valB = sum(2,3,4);
		
//		System.out.println("\tvalA\t\t" + valA);
		printer("valA", valA);
//		System.out.println("-->\t" + valB);
		printer(valB);
	}
	/**
	 * create two void methods called printer, one
	 * method should take a single parameter to format the print
	 * as "System.out.println("-->\t" + valB);"
	 * 
	 * and the second should format two parameters like...
	 * "System.out.println("\tvalA\t\t" + valA);"
	 */
	
	public static void printer(int inputA){
		System.out.println("-->\t" + inputA);
	}
	public  static void printer(String inputA, int inputB){
	 System.out.println("\t" + inputA + "\t\t" + inputB );
	}
	
	
	
	
	public static void methodA(int param){
		System.out.println("A");
	}
	
	public static void methodA(char param){
		System.out.println("B");
	}
	// a void tells us there is no return value.
	// any other data type must return a value.
	public static int sum(int a, int b){
		return a + b;
	}
	public static int sum(int a, int b, int c){
		return a + b +c;
	}
	
	
	
	
}






