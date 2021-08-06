public class TheIf{
   public static void main(String[] args){
      // we will use an array to get these values.
      // to declare an array we put [] behind the datatype
      char[] alphabet = {'a','b','c','d','e'};
      System.out.println(alphabet[0]);
      System.out.println(alphabet[3]);
      // java uses a static array.
      // that means it has a size when declared and
      // cannot change.
      char[] ALPHABET = new char[26];
      
      
      char letter = 'A';
      int i = 0;
      while(i<26){
         ALPHABET[i]= letter++;
         i++;
      }
      System.out.println(ALPHABET);
                  //the for loop
      for(int j = 0; j < 27 ; j++){
         System.out.println(ALPHABET[j]);
      }
              
      for(int k = 25; k >= 0 ; k--){
         System.out.println(ALPHABET[k]);
      }
      
      
      
   }
}