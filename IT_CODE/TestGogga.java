import it.Gogga;

public class TestGogga{
   public static void main(String[] args){
      Gogga.setGridSize(20,20);
      
      Gogga bug = new Gogga();
   
      int initPos = 9;
      
      bug.setPosition(9,9);
      
      bug.setDirection(1);
      bug.move();
      
      bug.setDirection(4);
      bug.move();
   
      bug.setDirection(2);
      bug.move();
      bug.move();
      
      bug.setDirection(3);
      bug.move();
      bug.move();
      
      bug.setDirection(1);
      bug.move();
      bug.move();
      bug.move();
      
      bug.setDirection(4);
      bug.move();
      bug.move();
      bug.move();
      
      bug.setDirection(2);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      
      bug.setDirection(3);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      
   }
}