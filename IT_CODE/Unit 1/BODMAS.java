public class BODMAS{

    public static void main(String[] args){
        // normal BEDMAS applies
        // 1) BRACKETS
        // 2) DIV and TIMES -> left to right (mod)
        // 3) ADD and MINUS -> left to right
        
        int x = 4 + (5  * 3) - (12 % 5);
        System.out.println(x);
        
        // WHERE TO DECLARE VARIABLES
        // You can declare them at the start of a method,
        // but it is suggested you declare variables as
        // close to where they are used as possible.    
    }
}