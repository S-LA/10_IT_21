public class TheIFstatement{
   public static void main(String[] args){
        /*
            THE IF STATEMENT IS THE BASIS FOR ALL CODE
            The format is:
            if(var1 conditional var2)
            {
                do something;
            } 
            else if (var2 conditional var3)
            {
                do something;
            }
            else 
            {
                do something;
            }
            The statement will be accessed if the condition in the ()
            is true.
            conditionals are -> 
            == (equal to);
            <  (less than)
            >  (greater than);
            <= (less than & equal to);
            >= (greater than and equal to);
            != (not equal to);
            
            if we are using boolean datatypes conditionals are not requried.
         */
         
      boolean one = true;
      if(one){
         System.out.println("1");
      }  else {
         System.out.println("0");
      }
      
      int x = 2;
      int y = 2;
      boolean check = x==y;
      // using conditionals returns a boolean
      if(check){
         System.out.println("1");
      }  
      if(x==y){
         System.out.println("1");
      }
      // both ifs are doing the same thing.
      
      char letter = 'B';
      int number = 0;
      
      if(letter=='A'){
        number = 1;
      } else if(letter == 'B'){
        number = 2;
      }else if(letter == 'C'){
        number = 3;
      } else {
        System.out.println("only A,B,C");
      }
      System.out.println(number);
      
      int a = 2;
      int b = 3;
      String result = "";
      if(a == 2){
        if(b ==1){
            result = "hi";
        }
        if(b==3){
            result = "no";
        }
      } else if(a == 3){
        result = "yes";
      } else {
        result = "no!!!!!!!!";
      }
      System.out.println(result);
      
      // we can get use two conditionals;
      
      boolean twoConditions = 2==2 && 3==2; 
      // this checks if both values are true.
      System.out.println(twoConditions);
      boolean twoConditions2 = 2==2 || 3==2;
      // && is and
      // || is pipe (or) 
      int g = 5;
      if(g++ == 5){
        System.out.println("t");
       }
      
      
   }
}
