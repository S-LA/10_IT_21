public class Ascii{
   public static void main(String[] args){
      int code = 0;
      for(int i = 0; i < 128; i++){
         System.out.print(code + " ");
         System.out.println((char)code);
         code++;
      }
      int dollar = 0b00100100;
      System.out.println((char)dollar);
      int seven = 0x37;
      System.out.println((char)seven);
      int are = 82;
      System.out.print((char)are);
      char and = '&';
      
      
      
      
      
   }
}