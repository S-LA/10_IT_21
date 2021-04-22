public class CheckPoint_2_check{
   public static void main(String[] args){
      // real -> string
      String one = Double.toString(2.3);
      System.out.println(one);
      // int -> string
      String two = Integer.toString(4);
      System.out.println(two);
      // string -> int
      int three = Integer.parseInt("23");
      System.out.println(three);
      // string -> real
      double four = Double.parseDouble("24.3");
      System.out.println(four);
      
      int whole = 4;
      double real = (double)whole;
      
      
      double real1 = 4.9;
      int whole1 = (int)(Math.round(real1));
      // double real2 = (double)whole1;
      System.out.println(whole1);
      System.out.println("----------");
      // rounding to two decimal placess
      double init = 4.548979;
      System.out.println(init);
      double times = init*100;
      System.out.println(times);
      double rounded = Math.round(times);
      System.out.println(rounded);
      double div = rounded/100;
      double answer = div;
      System.out.println(answer);
   }
}  