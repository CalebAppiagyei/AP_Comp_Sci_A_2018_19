
//--------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 10/15/19
//
// Title: Quadratic 
//
// Description: This program solves for
// the roots of a quadratic equation.
//
//--------------------------------------

import java.util.Scanner;
import java.text.DecimalFormat;

public class Quadratic_CBA
{
   public static void main(String[] args) 
   {
   
     // Name your Scanner 
      Scanner input = new Scanner(System.in);
      
      DecimalFormat fmt = new DecimalFormat ("0.###");
   
      double a, b, c, d, x1, x2, x1i, x2i;
   
      System.out.println("\n*** Quaratic Equation Solver ***\n");
      
        // Ask the user for each coefficient
      System.out.print("Enter a: ");
      a = input.nextDouble();
      System.out.print("Enter b: ");
      b = input.nextDouble();
      System.out.print("Enter c: ");
      c = input.nextDouble();
      
        // Give your discriminant a value
      d = (b * b) - 4 * a * c;
      
      if ( d > 0 ) {
         System.out.println("\nTwo real roots: ");
         x1 = ((-1 * b) + Math.sqrt(d)) / ( 2 * a );
         x2 = ((-1 * b) - Math.sqrt(d)) / ( 2 * a );
         System.out.println("x1 = " + fmt.format(x1));
         System.out.println("x2 = " + fmt.format(x2));
      }
      if ( d == 0 ) {
         System.out.println("\nOne real root:");
         x1 = (-1 * b) / ( 2 * a );
         System.out.println("x = " + fmt.format(x1));
      }
      if ( d < 0 ) {
         System.out.println("\nTwo imaginary roots:");
         x1 = (-1 * b) / ( 2 * a );  
         x2 = (-1 * b) / ( 2 * a );
         x1i =  Math.sqrt(-d) / ( 2 * a );
         x2i =  Math.sqrt(-d) / ( 2 * a );
         System.out.println("x1 = " + x1 + " + i" + fmt.format(x1i));
         System.out.println("x2 = " + x2 + " - i" + fmt.format(x2i));
      }
   }
}
   
