
//--------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 11/25/19
//
// Program:Scale
//
// Description: This program uses a starting 
// frequency to calculate an octave's worth
// of semitones
//
//---------------------------------------------

  // Import your Scanner and decimal format classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class Scale_CBA
{
   public static void main(String[] args)
   {
      
        // Name your scanner and deciaml format classes
      Scanner input = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("0.00");
   
        // Create your variables
      double freq; 
      double twelve = 1.0/12.0; 
      double root = Math.pow(2,twelve);   
      
      System.out.println("------------- Scale -------------\n");
        // Prompt the user for a starting frequency
      System.out.print("Enter starting frequency (Hz): ");
      freq = input.nextDouble();
      
        // Create your for loop
      for (int i = 0; i < 13; i++){
         System.out.println(fmt.format(freq));
         freq = freq * root;
      }
   }
}