
//-----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 11/15/19
//
// Title: Radioactive Decay
//
// Description: This program uses and initial 
// and final count rate as well as an elapsed
// time to calculate the radioactive decay and
// half-life
//
//-----------------------------------------------

  // Insert your Scanner and DecimalFormats
import java.util.Scanner;
import java.text.DecimalFormat;

public class Decay_CBA
{
   public static void main(String[] args)
   {
   
        // Name your Scanner class
      Scanner input = new Scanner(System.in);
        // Name your Decimal Format class
      DecimalFormat fmt = new DecimalFormat("0.00");
      
        // Create your variables
      double fa, ia, et, dc, hl, cr;
   
      System.out.println("---------- Radioactive Decay ----------");
      
        // Prompt the user for the required information
      System.out.print("\nEnter initial count rate (cpm): ");
      ia = input.nextDouble();
      System.out.print("Enter final count rate (cpm): ");
      fa = input.nextDouble();
      System.out.print("Enter elapsed time (years): ");
      et = input.nextDouble();
      
        // Calculate your lambda
      dc = Math.log(ia / fa) / et;
      
        // Calculate your half-life
      hl = (Math.log(0.5)) * -1 / dc;
      
      
        // Print your Lambda and Half-Life
      System.out.println ("\nLambda:    " + fmt.format(dc) + " years^-1");
      System.out.println ("Half-Life: " + fmt.format(hl) + " years");
      
      System.out.println();
      System.out.println(" Time     Activity");
      System.out.println("(years)    (cpm)");
      System.out.println("-------   -------");
      for( int i = 0; i < 11; i++){
         cr = ia * Math.pow(Math.E,(-dc * i));
         System.out.printf("  %2d        %4.0f\n",i,cr);
      } 
   
   
   }
}