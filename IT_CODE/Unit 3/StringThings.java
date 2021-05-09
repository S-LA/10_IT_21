public class StringThings{
   public static void main(String[] args){
      /*
          Strings are simply a bunch of chars put together.
          They are a massivly important class in Java.
          Java sees strings as a "privitive type"
          although they are officially an object.
          They have a range of methods that can be used on
          string objects.
      */  
      // to declare a String we use
      String words = "Good Bye"; // we only use these
      String moreWords = new String("See you later");//this is pointless
      
      System.out.println(words);
      
      words = words + ", " + moreWords;
      
      System.out.println(words);
      
      // useful methods in the string class.
      // the *.charAt(?); method allows us to select a specific
      // letter from a string.
      String name = "John";
      String middle = "Fitzgerald";
      String surname = "Kennedy";
      
      String initials = Character.toString(name.charAt(0)) + middle.charAt(0) +""+ surname.charAt(0) + "";
      System.out.println(initials);
      // String.length();
      // this method allows us to get the length of a string.
      
      int nameLength = name.length();
      System.out.println(nameLength);
      System.out.println("-----------------");
      
      String alpha = "abcdefghijk";
      for(int i = 0; i < alpha.length(); i++){
        System.out.println(alpha.charAt(i));
      }
      
      System.out.println(alpha.charAt(0));
      System.out.println(alpha.charAt(1));
      System.out.println(alpha.charAt(2));
      System.out.println(alpha.charAt(3));
      System.out.println(alpha.charAt(4));
      System.out.println(alpha.charAt(5));
      System.out.println(alpha.charAt(6));
      System.out.println(alpha.charAt(7));
      System.out.println(alpha.charAt(8));
      System.out.println(alpha.charAt(9));
      System.out.println(alpha.charAt(10));
      
   
   }

}