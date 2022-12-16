//----------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 9/20/19
//
// Period: 3
//
// Description: This program converts Celsius to Farenheit
//
//----------------------------------------

  // import Scanner class
import java.util.Scanner;

public class C2F_CBA
{
   public static void main(String[] args)
   {
   
     // Name your Scanner
   Scanner input = new Scanner(System.in);
   
     // Create your variables
   int celsius, farenheit;
   
   
   System.out.println("Program C2F: Converts Celsius to Farenheit \n");
     // Ask the user for a temperature in Celsius
   System.out.print("Enter the temperature in Celsius: ");
   celsius = input.nextInt();  
     // Convert the Celsius temperature to Farenheit
   farenheit = 9 * (celsius / 5) + 32;
   System.out.print("\nA temperature of " + celsius +"C is " + farenheit + "F.");
   
   
   }
}