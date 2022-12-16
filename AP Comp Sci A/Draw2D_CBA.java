
//-----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 3/11/20
//
// Program: Draw2D
//
// Description: This program will use the users
// input to display an image.
//
//-----------------------------------------------
  
  // Import your Scanner
import java.util.Scanner;

public class Draw2D_CBA
{
   public static void main(String[] args)
   {
     // Name your Scanner
      Scanner input = new Scanner(System.in);
   
      System.out.println("|*|*|*| Program Draw2D |*|*|*|\n");
      
      // Create your variables
      int xcor = 11, ycor = 11, num, num2;
   
     // Create your two dimensional array
      int[][] coors = new int[xcor][ycor];
   
      // Ask the user for each coordinate
      do{
         System.out.print("Enter \"x\" coordinate (-1 to end): ");
         num = input.nextInt();
         if( num != -1 ){
            System.out.print("Enter \"y\" coordinate: ");
            num2 = input.nextInt();
            coors[num][num2] = 1;
         }
      }while(num != -1);
      System.out.println();
      
        // Print your graph
      System.out.println(" ----------------------- ");
      for(int i = 10; i >= 0; i--){
         System.out.print("| ");
         for(int g = 0; g < 11; g++){
            if(coors[g][i] == 1){
               System.out.print("* ");
            }
            else{
               System.out.print("  ");
            }
         }
         System.out.println("|");
      }
      System.out.println(" ----------------------- ");
   }
}