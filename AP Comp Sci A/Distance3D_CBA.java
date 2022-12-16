//-------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 9/30/19
//
// Program: Distance3D
//
// Description: This program will ask the user for 
// three points and print out the distance of the three points
//
//-------------------------------------------

  // Import Scanner class
import java.util.Scanner;
  // Import Decimal Format class
import java.text.DecimalFormat;

public class Distance3D_CBA 
{
   public static void main(String[] args)
   {
        // Name your Scanner and Decimal Format classes
      Scanner input = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat ("0.###");
      
      System.out.println("Program Distance3D: Calculates the distance between two points in 3D space."); 
        // Ask the user for each X value
      System.out.print("\nEnter x1: ");
      int a1 = input.nextInt();
      System.out.print("Enter y1: ");
      int b1 = input.nextInt();
      System.out.print("Enter z1: ");
      int c1 = input.nextInt();
      
        // Ask the user for each Y value
      System.out.println();
      System.out.print("\nEnter x2: ");
      int a2 = input.nextInt();
      System.out.print("Enter y2: ");
      int b2 = input.nextInt();
      System.out.print("Enter z2: ");
      int c2 = input.nextInt();
      
        // Calculate the distance between the points
      double d = Math.sqrt((a1 - a2)*(a1-a2)+(b1 - b2)*(b1-b2)+(c1 - c2)*(c1-c2));
      
        // Print the distance between the points
      System.out.println();
      System.out.print("\nThe distance between (" + a1 + "," + b1 + "," + c1 + ") and (" + a2 + "," + b2 + "," + c2 + ") is : ");
      System.out.print(fmt.format(d));
      
      
   }
}