import it.*;  // this includes the Gogga lib.
import java.awt.*;

public class MakeSquare{
   public static void main(String[] args){
   /* Java is object orientated this means that 
    * we can make objects and use methods to change
    * what the object does. 
    */
    
    Gogga.setGridSize(15,20);
    // the .setGridSize is a static method. This means
    // it needs to be called before the object is created.
    Gogga bug = new Gogga(2,5);
    bug.move();
    bug.move();
    bug.move();
    bug.move();
    bug.turnRight();
    bug.setColor(Color.blue);
    bug.move();
    bug.move();
    bug.trailOff();
    bug.move();
    bug.trailOn();
    bug.move();
    bug.turnRight();
    bug.move();
    bug.move();
    bug.move();
    bug.move();
    bug.setDirection(4);
    bug.move();
    
    
   }
}