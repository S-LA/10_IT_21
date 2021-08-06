/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */
import lang.Math.*;
public class flow1 {
   public static void main(String[] args)
   {
   /*   // declare variables
      ?? output = ??;
      ?? DiceTwo = ??;
      ?? TotalDice = ??;
      ?? DiceOne = ??; */
      
      DiceOne = floor((Math.random() * 6) + 1);
      printLine("DiceOne: " + DiceOne);
      DiceTwo = floor((Math.random() * 6) + 1);
      printLine("DiceTwo: " + DiceTwo);
      if (DiceOne % 2 == 0)
      {
         TotalDice = DiceOne + DiceTwo;
         output = TotalDice;
      }
      else
      {
         if (DiceOne <= DiceTwo)
         {
            if (DiceOne == DiceTwo)
            {
               output = DiceOne * DiceTwo;
            }
            else
            {
               output = DiceTwo - DiceOne;
            }
         }
         else
         {
            output = DiceOne - DiceTwo;
         }
      }
      printLine("SCORE: " + output);
   } // close main
} // close flow1
