public class OverWrite{
   public static void main(String[] args){
      // first we need to declare a variable
      int varA;
      // then we need to assign a value to it.
      // this is also initialising.
      varA = 5;
      // but you can do these two steps in one.
      int varB = 8;
      
      //we can also declare, assign and do a 
      // calculation in one line as well.
      int varC = varA + varB;
      
      //STRINGS AND THIS STUFF
      // Strings are objects (not primitive type)
      // We use them as if they were primitive.
      String name = new String("Hello");
      System.out.println(name);
      // We no longer have to Initilise a string objects.
      String name2 = "Hello Again"; 
      System.out.println(name2);
      String name3 = name2.toUpperCase();
      System.out.println(name3);
      
      // we can change the values assigned to
      // a variable by initilising it again.
      System.out.println(varA);
      varA = 9;
      varA = varA + 4;
      System.out.println(varA);
      
   }
}
   