import it.Gogga;

public class TestGoggaTwo{

   public static void main(String[] args){
   
      Gogga.setGridSize(20,20);
      
      Gogga bug = new Gogga();
      
      bug.setPosition(9,9);
      
      int moves = 1;
      int count = 1;
      for(int i = 0; i < 10; i++){
         if(count == 1){
            bug.setDirection(1);
            mover(moves);
            count = 2;
         }
         if(count == 2){
            bug.setDirection(4);
            bug.move(moves);
            count = 3;
         }
         moves++;
         if(count == 3){
            bug.setDirection(2);
            bug.move(moves);
            count = 4;
         }
         if (count == 4){
            bug.setDirection(3);
            bug.move(moves);
            count=1;
         }
         moves++;
      
      }
      
   }
}
