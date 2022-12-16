
//----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 1/31/2020
//
// Program: Reverser2
//
// Description: This program prompts the
// user for a few values and prints them in
// different orders
//
//----------------------------------------------

  // Insert your scanner
import java.util.Scanner;
  // Insert your random
import java.util.Random;


public class Reverser2_CBA
{
   public static void main(String[] args)
   {
   
        // Name your scanner
      Scanner input = new Scanner(System.in);
   
      System.out.println("/\\/\\/\\/\\/\\ Program Reverser /\\/\\/\\/\\/\\\n");
   
        // Ask the user for the amount of values they will be entering
      System.out.print("Number of values: ");
      int v = input.nextInt();
   
        // Create youd array
      double[] values = new double[v];
        // Name your random class
      Random generator = new Random();
      
      System.out.println();
        // Create your for loop
      for(int i = 0; i < v; i++){
         System.out.print("Enter value #" + (i + 1) + ": ");
         values[i] = input.nextDouble();
      }
        // Print the values in forward order
      System.out.println();
      System.out.println("In forward order ... ");
      for( int z = 0; z < v; z++){
         System.out.print(values[z] + " ");
      }
        // Print the values in reverse order ...
      System.out.println("\n");
      System.out.println("In reverse order ...");
      for ( int y = v - 1; y > -1; y--){
         System.out.print(values[y] + " ");
      }
        // Print the values in random order ...
      System.out.println("\n");
      System.out.println("In random order ...");
      int r = generator.nextInt(v);
      double temp;
      for (int g = 0; g < v; g++){
         temp = values[g];
         values[g] = values[r];
         values[r] = temp;
         r = generator.nextInt(v);
      }
      for( int a = 0; a < v; a++){
         System.out.print(values[a] + " ");
      }
   }
}