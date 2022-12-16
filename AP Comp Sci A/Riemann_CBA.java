
//------------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 12/19/19
//
// Title: Riemann
//
// Description: This program uses the diameter
// of the circle to calculate the area in square
// centimeters
//
//------------------------------------------------

  // Insert your Scanner and Decimal Format classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class Riemann_CBA
{
   public static void main(String[] args)
   {
    
      Scanner input = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("0.000");
   
      System.out.println("0-0-0-0-0-0 Program Riemann 0-0-0-0-0-0\n");
      
        // Create your variables
      double d, dx, r, y, a;
   
        // Prompt the user for the diameter
      System.out.print("Enter Diameter (cm): ");
      d = input.nextDouble();
   
        // Calculate the radius
      r = d / 2.0;
     
        // Prompt the user for an increment
      System.out.print("\nEnter x-increment (cm): ");
      dx = input.nextDouble();
      
      double x = 0;
      a = 0;
        // Calculate your area
      while(x <= r){
         y = Math.sqrt((r*r) - (x*x));
         a += y * dx;
         x = x + dx;
      }
      System.out.print("\nThe area of a circle with a diameter of " + fmt.format(d) + " cm is " + fmt.format(a * 4) + " cm^2.");
   }
}