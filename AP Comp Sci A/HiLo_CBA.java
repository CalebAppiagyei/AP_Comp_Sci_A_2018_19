
//---------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 12/12/2019
//
// Title: HiLo 
//
// Description: This pogram generates a number
// and prompts the user to guess the number
//
//----------------------------------------------

  // Insert your Random and Scanner class
import java.util.Random;
import java.util.Scanner;

public class HiLo_CBA 
{
   public static void main(String[] args)
   {
   
        // Name your Scanner and Random classes
      Scanner input = new Scanner(System.in);
      Random generator = new Random();
   
        // Create your variables
      int cnum, unum, guesses;
      char again = 'z';
   
      System.out.println("===== Program HiLo =====");
      do {
         System.out.println("\nI'm thinking of a number between 1 and 100 (inclusive)...");
         
           // Create a random number
         cnum = generator.nextInt(99)+1;
         
           // Prompt the user for a guess
         System.out.print("\nYour guess? ");
         unum = input.nextInt();
         guesses = 1;
         
           // Print a message if the user gets it on their first try
         if( guesses == 1 && unum == cnum){
            System.out.print("You got it! My number was " + cnum + ". It took you " + guesses + " guess."); 
            System.out.print("Play again (y/n)? ");
            again = input.next().charAt(0);
            if ( again == 'y' ){
               cnum = generator.nextInt(99)+1; 
            }
         }
           // Use a do loop to give feedback for each guess
         do {
            while(unum > cnum){
               System.out.print("Too high! Your guess? ");
               unum = input.nextInt();
               guesses++;
            }
            while(unum < cnum){
               System.out.print("Too low! Your guess? ");
               unum = input.nextInt();
               guesses++;
            }
            if (unum == cnum){
               System.out.print("You got it! My number was " + cnum + ". It took you " + guesses + " guesses.");
                 // Ask the user if they would like to play again 
               System.out.print(" Play again (y/n)? ");
         }while(unum != cnum);
      }while(again == 'y');
   }
}