public class TheWhile{
   public static void main(String[] args){
        
        // the while loops is useful if we dont know how many
        // loops will be required.
        
      int i = 0;
      while(i != 5){
       //while(i < 5){ will in effect do the same thing 
         System.out.println(++i);
      }
      System.out.println(i + "\n-----------------------");
       
       // you do not need to have a conditional statement in the while.
       // you can just have a boolean value.
      char number = '@';
      boolean check = true;
      while( check ){
         System.out.println(++number);
         if(number == 'Z'){
            //break;
            check = false; // break is faster and makes sure you
            // exit the loop.
         }
      }
       
       
        
    
   }
}