
public class PrimitiveTypes{
   public static void main(String[] args){
   // primitive types are the most basic variables
   
   // the most simple is the boolean
   // stores true or false;
      boolean tf = true;
      tf = false;
      if(!!!tf){
         System.out.println("Its True"); 
      }
   
      line();
   // CHARS -> 16 bit values -> 2byte
   // used to store single alphanumberic symbols
      int max_char = (int)Character.MAX_VALUE;
      System.out.println(max_char);
   
      char letterA = 65; //ascii as a decimal
      char letterB = 'B'; //ascii as a char
      char letterC = 0x43; // ascii as a hex
      char letterD = 0b1000100; //ascii as a bin

      System.out.println(letterA);
      System.out.println(letterB);
      System.out.println(letterC);
      System.out.println(letterD);
      System.out.println(letterE);   
      line();
   
   //    BYTE -> small values
   // -128 -> +127
   
      byte binA = 124;
      System.out.print(binA);
   
      line();
   // Short similar to char (also 16 bits)
   
      short littleNum = 2369;
      System.out.println(littleNum);
      line();
   /*
   for(int i = 0; i < (int)Short.MAX_VALUE; i++){
      System.out.println(i);
   }
   */
      line();
   // INTEGERS -> usually use ints for numbers
      int valueA = 1;
      int valueB = 5;
      System.out.println(valueA++);
      System.out.println(valueA);
      System.out.println(++valueB);
   
   
   
   
      
   }
   public static void line(){
      System.out.println("----------------------");
   }
   //polymorphism
   public static void printer(String value){
      System.out.println("s" + value);
   }
   public static void printer(int value){
      System.out.println("i" + value);
   }
   
}