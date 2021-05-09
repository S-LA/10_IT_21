public class Incrementing{
 
   public static void main(String[] args){
        // incrementing is a shorthand type code.
        // it allows us to add or subtract in one operation.
        // preincrementing - ++x - will add before using the number
        // postincrementing - x++ - will add after using the number
        
        int x = 3;
        int y = 3;
        
        x = x + 1; // same as x++;
        System.out.println(x);
        
        y++;
        System.out.println(y);
        System.out.println(++y); // using a preincrement
        System.out.println(y++);              
        System.out.println(y);
        y--;
        System.out.println(--y); 
        
        int z = ++x + --y;
        System.out.println(z);
        
        int v = 2;
        
         while(v<=30){
           v++;
             System.out.println(v);
         }
         
        
      
        
   }
}