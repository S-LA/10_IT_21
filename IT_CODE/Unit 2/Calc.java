import javax.swing.*;

public class Calc{
   public static void main(String[] args){
      // initially we are just going to add two values.
      String num1 = JOptionPane.showInputDialog("Enter First Num");
      String num2 = JOptionPane.showInputDialog("Enter Second Num");
      int val1 = Integer.parseInt(num1);
      int val2 = Integer.parseInt(num2);
      int answer = val1 + val2;
      System.out.println(num1 + "+" + num2 + "=" + answer);
   }
}