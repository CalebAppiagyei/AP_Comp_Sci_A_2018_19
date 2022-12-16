
//-----------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 11/6/19
//
// Title: Leap Year
//
// Description: This program prompts the
// user for a year and determines whether
// it is a leap year or not
//
//-----------------------------------------

  // Insert your Scanner class
import java.util.Scanner;

public class LeapYear_CBA
{
   public static void main(String[] args)
   {
   
        // Name your Scanner class
      Scanner input = new Scanner(System.in); 
      
        // Create your variables
      int year, remainder4, remainder400, remainder100;
   
        // Prompt the user for a year
      System.out.print("Enter Year: ");
      year = input.nextInt();
      
        // Determine whether the year fits the leap year criteria
      remainder4 = year % 4;
      remainder400 = year % 400;
      remainder100 = year % 100;
   
        // Create your conditional statements
      if ( year < 1582 ) {
         System.out.println("\n" + year + " is invalid.");
      }
      if ( year >= 1582 ) {
         if ( remainder4 == 0 && remainder100 != 0 ){
            System.out.println("\n" + year + " is a leap year."); 
         }
         else if ( remainder400 == 0 ) {
            System.out.println("\n" + year + " is a leap year.");   
         }
         else {
            System.out.println("\n" + year + " is NOT a leap year.");   
         }
      } 
   }
}