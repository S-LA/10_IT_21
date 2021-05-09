import javax.swing.*;
public class ThreeWords{
   public static void main(String[] args){
//         String one = JOptionPane.showInputDialog("First Word");
//         String two = JOptionPane.showInputDialog("Second Word");
//         String thr = JOptionPane.showInputDialog("Third Word");
        String one = "whatever";
        String two = "words";
        String thr = "entered";
        
        int let1 = one.length();
        int let2 = two.length();
        int let3 = thr.length();
        int let4 = let1+let2+let3;
        
        String combine = one + two + thr;
        int let5 = combine.length();
        System.out.println(combine);
        
        System.out.println("Word 1 = " + let1 + " letters");
        System.out.println("Word 2 = " + let2 + " letters");
        System.out.println("Word 3 = " + let3 + " letters");
        System.out.println("All togther = " + let4 + " letters");
        
        /*
        Word 1 = ? letters
        Word 2 = ? letters
        Word 3 = ? letters
        All together = ??? letters
        */
        
   }
}