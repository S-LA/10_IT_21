import javax.swing.*;

public class PersonalDetails{
   public static void main(String[] args){
   
      String first = JOptionPane.showInputDialog("First Name");
      String last = JOptionPane.showInputDialog("Surname");
      String tel = JOptionPane.showInputDialog("Phone");
      int yob = Integer.parseInt(JOptionPane.showInputDialog("YOB"));
      double height = Double.parseDouble(JOptionPane.showInputDialog("Height"));;
      
      System.out.println(); 
      System.out.println("PERSONAL DETAILS"); 
      System.out.println();
      
      System.out.println("NAME  : " + first + " " + last);
      System.out.println("YOB   : " + yob);
      System.out.println("HEIGHT: " + height);
      System.out.println("TEL   : " + tel);
   }


}