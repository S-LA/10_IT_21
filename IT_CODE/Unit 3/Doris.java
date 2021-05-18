import javax.swing.*;

public class Doris{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Name:");
        char firstLet = name.charAt(0);
        char AY = '@';
        int diff = (int)firstLet - (int)AY ;
        System.out.print(diff);
        
        
    }
}