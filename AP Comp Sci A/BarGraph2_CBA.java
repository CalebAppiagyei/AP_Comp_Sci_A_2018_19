
//---------------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 2/14/20
//
// Program: Bar Graph 2
//
// Description: This program uses the users input 
// to generate a digital bar graph
//
//---------------------------------------------------

  // Create your Scanner
import java.util.Scanner;

public class BarGraph2_CBA
{
   public static void main(String[] args)
   {
        // Name your Scanner
      Scanner input = new Scanner(System.in);
   
      System.out.println("|*|*|*|*| Program BarGraph2 |*|*|*|*|\n");
   
        // Create your array
      int[] values = new int[20];
      
        // Create your variables
      int num;
      
        // Ask the user for their input
      do{
         System.out.print("Enter value between 0 and 100 (0 to end): ");
         num = input.nextInt();
         for(int i = 0; i < 20; i++){
            if(num >= 5 * i + 1 && num <= 5 * i + 5){
               values[i]++;
               i = i + 20;
            }
         }
      }while(num != 0);
      
      System.out.println();
      
        // Print the bar graph
      for(int i = 0; i < 20; i++){
         System.out.printf("%2d - ",5 * i + 1);
         System.out.printf("%3d | ",5 * i + 5);
         for (int y = 0; y < values[i]; y++){
            System.out.print("#");
         } 
         System.out.println();
      }
   }
}