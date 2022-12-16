
//----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 10/4/2019
//
// Program: Flowchart
//
// Description: This program will ask the user
// yes or no questions which will determine their
// path through a flow chart.
//
//-----------------------------------------------

  // Import your Scanner class
import java.util.Scanner;

public class Flowchart_CBA 
{
   public static void main(String[] args)
   {
        // Name your Scanner
      Scanner input = new Scanner ( System.in );
   
      System.out.println("---------- Engineering Flowchart ----------/n");
      
      char m, s, s2;
      
      System.out.print("\nDoes it move?");
      m = input.next().charAt(0);
      
      if ( m == 'y' || m == 'Y' ){
         System.out.print("Should it?");
         s = input.next().charAt(0);
         if ( s == 'y' || s == 'Y' ) {
            System.out.print("\nNo Problem");
         }
         if ( s == 'n' || s == 'N' ){
            System.out.print("\nDuct Tape!");
         }
      }
      if ( m == 'n' || m == 'N' ) {
         System.out.print("Should it?");
         s2 = input.next().charAt(0);
         if ( s2 == 'y' || s2 == 'Y' ) {
            System.out.print("\nWD-40!");
         }
         if ( s2 == 'n' || s2 == 'N' ) {
             System.out.print("\nNo Problem"); 
         }
      }
   }
}