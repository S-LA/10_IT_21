import javax.swing.*;

public class BigCalc{
   public static void main(String[] args){
      String num1 = JOptionPane.showInputDialog("Enter First Num");
      String num2 = JOptionPane.showInputDialog("Enter Second Num");
      double val1 = Double.parseDouble(num1);
      double val2 = Double.parseDouble(num2);
      double sum = Math.round((val1 + val2)*100);
      double sum2 = sum/100;
      System.out.println(sum2);
   }
}