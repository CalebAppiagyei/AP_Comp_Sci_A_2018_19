
//----------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 2/27/20
//
// Program: Bar Graph 3
//
// Description: This program uses the users
// input to generate a java bar graph
//
//----------------------------------------------

  // Create your Scanner
import java.util.Scanner;

public class BarGraph3_CBA
{
   public static void main(String[] args)
   {
   
        // Name your Scanner
      Scanner input = new Scanner (System.in);
   
      System.out.println("|+|+|+|+| Program BarGraph3 |+|+|+|+|\n");
   
        // Create your array
      int[] values = new int[101];
   
        // Create your variables
      int num, height = 1, remainder, remainder2;
      
        // Create a loop that takes the users input
      do{
         System.out.print("Enter score between 0 and 100(-1 to end): ");
         num = input.nextInt();
         for(int i = 0; i < 101; i++){
            if( num == i ){
               values[i]++;
               i = i + 100;
            }
         }
      }while( num != -1);
   
      System.out.println();
      
        // Create a loop that uses each array value to determine the height of the graph
      for( int i = 0; i < 101; i++){
         if( values[i] > height ){
            height = values[i];
         }
      }
        // Create your Bar Graph
      for( int i = height; i > 0; i-- ){
         remainder = i % 5;
         if(remainder == 0){
            System.out.printf("%2d -|",i);
         }
         else{
            System.out.print("    |");
         }
         for( int y = 0; y < 101; y++){
            if(values[y] >= i){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      System.out.print("  0-+");
      for( int i = 0; i < 101; i++){
         remainder2 = i % 10;
         if( remainder2 == 0){
            System.out.print("|");
         }
         else{
            System.out.print("=");
         }
      }
      System.out.println();
      System.out.print("     ");
      System.out.println("0         1         2         3         4         5         6         7         8         9         1");
      System.out.println("               0         0         0         0         0         0         0         0         0         0");
      System.out.print("                                                                                                         0");
   }
}