import javax.swing.*;
public class Exerise3{
// page 51
   public static void begin(){
      String input = JOptionPane.showInputDialog("Number?");
      int value = Integer.parseInt(input);
      value = value + 2;
      char letter = (char)value;
      System.out.println("The ASCII " + value + 
         " is the symbol " + letter); 
   }
   public static void oneGo(){
      char letter =  (char)(Integer.parseInt(
             JOptionPane.showInputDialog(
                 "Number?")) + 2);
      System.out.println(letter);
   }
   public static void doris(){
      // take an input of a name and display the 
      // position of the alphabet of the first letter
      // of the name.
      
   }
   public static void main(String[] args){
        //Q1
        System.out.println("How are you".charAt(5));
        char space = 'A';
        int convert = (int)space + 32;
        System.out.println((char)convert);
        //Q2    
        begin(); 
        oneGo();
        oneGo();
        System.out.print(ln);
        
        
        
   }   
}