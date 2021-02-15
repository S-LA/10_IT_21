public class DataTypes 
{  
   public static void main(String[] args)
   {
      //System.out.print(41);   
      // data types are different ways to 
      // store information in a program.
      // Each language decides how many bytes         
      // to allocate to each type.
      // Java has several primitive data types.
      // The commnly used ones are:
      // char -> a single character [1 byte of space].
      char letter = 65;
      char letterTwo = 't';
      int letterNum = (int)letterTwo+1;
      letterTwo = (char)letterNum;
      System.out.println(letter);
      System.out.println(letterNum);
      System.out.println(letterTwo);
      //char is useful up to 127, when we use
      // these numbers it prints the ASCII 
      // (American Standard Code for Information 
      // Interchange),value for the number.
      
      // short is a small number data type, it's not
      // used too much in Java.
      // it represents -32768 to 32767
      short numShort = 54;  
      System.out.println(numShort);
      
      // the most important number variable (type)
      // is the integer... int.
      // They can hold numbers between:
      // -2147483648 to 2147483647 as they are 4 bytes
      // long.
      int num = 2147483647;
      int numTwo = num+1;
      numTwo = Math.abs(numTwo);
      System.out.println(numTwo);
      
      // Long now and int are the same thing.
      // in java some libriaries will require you 
      // to use long, such as the timing libs.
      System.out.println("----------------");
      long startTime = System.nanoTime();
      System.out.println(startTime);
      long endTime = System.nanoTime();
      System.out.println(endTime);
      long deltaTime = endTime - startTime;
      System.out.println(deltaTime);
      
      // BOOLEANS
      // Booleans represent true and false
      // they take up 1 byte of space.
      
      boolean yesOrNo = false;
      if(yesOrNo){
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
      
      // FLOAT 
      // floats hold decimal numbers.
      // 8 bytes long and have 
      // min and max of
      // +/-3.4x10^(+/-38), they are not really used in 
      // java, double is used more often.
      // as doubles can go up to 1.7x10^308
      
      for(float i = 0.0f; i > -1.0f;i++){
         if(!i%1000){
            System.out.println(i);
         }
      } 
       
      
      
      
      
      
      
      
      
           
      
   }  
}