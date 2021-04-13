import javax.swing.*;

public class Prices{
   public static void main(String[] args){
      // product one
      String product1 = JOptionPane.showInputDialog("PRODUCT 1\nName:");
      double price1 = Double.parseDouble(JOptionPane.showInputDialog("PRODUCT 1\nPrice:"));
      // product two
      String product2 = JOptionPane.showInputDialog("PRODUCT 2\nName:");
      double price2 = Double.parseDouble(JOptionPane.showInputDialog("PRODUCT 2\nPrice:"));
      // product three
      String product3 = JOptionPane.showInputDialog("PRODUCT 3\nName:");
      double price3 = Double.parseDouble(JOptionPane.showInputDialog("PRODUCT 3\nPrice:"));
   
      // get total value
      double total = price1 + price2 + price3;
      
      System.out.println("SHOPPING LIST");
      System.out.println("");
      System.out.println(product1 + "\t" + price1);
      System.out.println(product2 + "\t" + price2);
      System.out.println(product3 + "\t" + price3);
      System.out.println("Total" + "\t" + total);
   }
}