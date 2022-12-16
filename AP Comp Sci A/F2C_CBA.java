
//----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 9/26/19
//
// Program: F2C
//
// Description: This program prompts the user to
// enter a temperature in farenheit and displays
// their temperature in celsius
//
//-----------------------------------------------

  // Import your Scanner class
import java.util.Scanner;

  // Import your Decimal Format
import java.text.DecimalFormat;

public class F2C_CBA
{
   public static void main(String[] agrs)
   {
   
     // Name your Scanner class
      Scanner input = new Scanner (System.in);
     // Round your decimal to three decimal places
      DecimalFormat fmt = new DecimalFormat ("0.000");
   
     // Create your variables
      double farenheit, celsius;
   
      System.out.println("\nProgram F2C: Converts Farenheit to Celsius");
   
     // Ask the user for a temperature in Farenheit
      System.out.print("\nEnter the temperature in Farenheit: ");
      farenheit = input.nextDouble();
   
     // Convert the Farenheit temperature to Celsius
      celsius = (farenheit - 32) * 5 / 9;
   
     // Print the temperatue in Celsius
      System.out.print("\nA temp of " + fmt.format(farenheit) + " F is "); 
      System.out.print(fmt.format(celsius) + " C.");
   
   }
}