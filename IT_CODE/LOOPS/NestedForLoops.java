public class NestedForLoops{
   public static void main(String[] args){
      int vMax = 20;
      int hMax = 20;
      char symbol = '-';
        
       
      for(int vCur = 0; vCur < vMax ; vCur++){
         for(int hCur = 0; hCur <= vCur; hCur++){  
            System.out.print(symbol);
         }
         System.out.println("");
      }
   
        
   }
}