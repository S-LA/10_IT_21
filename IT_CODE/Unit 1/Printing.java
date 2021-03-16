public class Printing{
   public static void main(String[]args){
      System.out.print("1) Hello ");
      System.out.println("World");
      
      System.out.print("2) Pineapple" + "\t");
      // "\t" is the special character for tab.
      System.out.print("Pen" + "\n" );
      // "\n" is the special character for enter(return)
      
      System.out.print("3) Pizza" + "\t");
      System.out.print("pie");
      
      System.out.print("Hello\t again\n newline\n");
      
      String number1 = "4";
      String number2 = "2";
      String number3 = number1 + number2;
      System.out.println(number3);
      System.out.println("A quote \" hello\" ");
      
      // concatenation
      int num1 = 1;
      String text = "number: ";
      String text1 = text + num1;
      System.out.println(text1);
   }  
}