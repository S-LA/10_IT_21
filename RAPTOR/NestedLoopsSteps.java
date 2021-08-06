/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class NestedLoopsSteps /*extends eecs.Gui*/
{
   public static void main(String[] args)
   {
      // declare variables
    //   ?? symbol = ??;
//       ?? vcur = ??;
//       ?? hcur = ??;
//       ?? hmax = ??;
//       ?? vmax = ??;
      
     int hmax = 5;
      int vmax = 5;
      char symbol = '-';
      int hcur = 0;
      int vcur = 0;
      while (vcur != vmax)
      {
         while (hcur != (vcur + 1))
         {
            System.out.print(symbol);
            hcur = hcur + 1;
         }
         System.out.println("");
         vcur = vcur + 1;
         hcur = 0;
      }
   } // close main
} // close NestedLoopsSteps
