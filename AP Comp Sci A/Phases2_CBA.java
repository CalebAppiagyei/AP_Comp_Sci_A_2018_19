
//-------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 10/31/19
//
// Program: Phases2
//
// Description: This program will prompt 
// the user for a temperature and deterimine
// th phase that water will exist
//
//-------------------------------------------

  // Import your scanner class
import java.util.Scanner;
  // Import your DecimalFormat class
import java.text.DecimalFormat;

public class Phases2_CBA
{
   public static void main(String[] args)
   {
   
        // Name your Scanner class
      Scanner input = new Scanner (System.in);
      
      DecimalFormat fmt = new DecimalFormat("0");
   
      System.out.println("---(C/F) Program Phases (F/C)---\n");
      
        // Create your variables
      double tempf, tempc;
      char tempunit;
      
        // Prompt the user for a temperature unit and degrees
      System.out.print ("Enter temperature units (C or F) ");
      tempunit = input.next().charAt(0);
      
        // Create a statement for invalid choices
      while ( tempunit != 'c' && tempunit != 'C' && tempunit != 'f' && tempunit != 'F'){
         System.out.println("\nInvalid input!\n");
         System.out.print ("Enter temperature units (C or F) ");
         tempunit = input.next().charAt(0);
      }
   
   
      if ( tempunit == 'c' || tempunit == 'C' ){
         System.out.print("\nEnter temperature (degrees): ");
         tempc = input.nextDouble();
         tempf = 9 * (tempc / 5) + 32;
         if (tempf < 32) {
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Solid (Ice)");
         } 
         if (tempf == 32){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Melting/Freezing Point");   
         }
         if (tempf > 32 && tempf < 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Liquid (Water)");   
         }
         if (tempf == 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Boiling/Condensing!");
         }
         if (tempf > 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Gaseous Phase (Steam)");
         }
      }
      if ( tempunit == 'f' || tempunit == 'F' ){
         System.out.print("\nEnter temperature (degrees): ");
         tempf = input.nextDouble();
         tempc = (tempf - 32) * 5 / 9;
         if (tempf < 32) {
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Solid (Ice)");
         } 
         if (tempf == 32){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Melting/Freezing Point");   
         }
         if (tempf > 32 && tempf < 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Liquid (Water)");   
         }
         if (tempf == 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Boiling/Condensing!");
         }
         if (tempf > 212){
            System.out.println("\nWater at " + fmt.format(tempc) + "C/" + fmt.format(tempf) + "F is: Gaseous Phase (Steam)");
         }
      }
   }
}