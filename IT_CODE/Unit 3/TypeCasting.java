public class TypeCasting{
   public static void main(String[] args){
      /*
       *   Typecasting is the act of converting from one datatype
       *   to another.
       *   There are two kind, implicit and explicit.
       *   -implicit happens when a value can be another datatype
       *    (also called widening conversion) [smaller -> larger]
       *   -explicit happens when a value needs to be made smaller
       *    (also narrowing conversion) [larger-smaller]
       *    !!!!!!!!! DATA CAN BE LOST WHEN DOING THIS !!!!!!
       */
       
      int val1 = 6;
      double val2 = val1;
      System.out.println(val2);
       
      double val3 = 3_00_000_000;
      int val4 = (int)val3;
      int val5 = (int)Math.round(val3);
      System.out.println(val4);
      System.out.println(val5);
       
      int val6 = 65536;
      short val7 = (short)val6;
      System.out.println(val7);
       
      double val8 = (double)(4/8d);
      System.out.println(val8);
       /*
      //int i1 = 100; 
       // we can also encapsulate int in Integer objects
 //      Integer i2 = 130;
//       Integer i3 = 130;
      String name1 = new String("word");
      String name2 = new String("word");
      if(name1 == name2){
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
      */
      
      // CHANGING FROM NUMBER TO WORD DATATYPES
      // we cannot just use simple explicit casting.
      // we have to use methods provided in JDK classes.
      // the usual methods to use. 
      // number -> string [ NumberObject.toString(x) ]
      // NumberObjects -> int(Integer), double(Double)
      // char(Character), short(Short)
      
      int num = 77665676;
      String digits = Integer.toString(num);
      String digits2 = num + ""; // cheat method adding a string
      System.out.println(digits);
      
      int len = digits.length();
      System.out.println("The number is " + len + " digits long");
      
      // string -> number [ObjectNumber.parseNum()]
      
   }
}
