import javax.swing.*;

public class GUIOutput{
   public static void main(String[] args){
      //String name = JOptionPane.showInputDialog("Name?");
      String name = "Kurt";
      JOptionPane.showMessageDialog(
        null, "Hello " + name + ".\\ How are you?"
      );
        System.out.println("\"Hello\"" + name + ".\n\tHow are you?");
        /*
         ESCAPE CHARACTERS (help with formatting)
            1) \n -> new line
            2) \t -> moves cursor to next tab
            3) \\ -> prints a backslash
            4) \' -> prints a single quote
            5) \" -> print a double quote
        */
   }
}
