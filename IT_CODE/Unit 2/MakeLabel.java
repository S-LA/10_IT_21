import javax.swing.*;// this is the simple GUI framework

public class MakeLabel{
   public static void main(String[] args){
      // this is the variable declaration section.
      // where we assign a "function" to a data type. 
      String name = JOptionPane.showInputDialog("Enter Name");
      String subject = JOptionPane.showInputDialog("Enter Subject");
      int grade = 10;
      // each variable has three parts
      // 1) the data type
      // 2) identifier 
      // 3) value
      System.out.println("****************");
      System.out.println("Name    : " + name);
      System.out.println("Subject : " + subject);
      System.out.println("Grade   : " + grade);
      System.out.println("****************");
      
   }
}