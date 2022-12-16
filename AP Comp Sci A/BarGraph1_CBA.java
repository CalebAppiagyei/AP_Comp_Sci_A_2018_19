
//------------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 2/10/20
//
// Program: Bar Graph
//
// Description: This program uses the users input 
// to generate a digital bar graph
//
//-------------------------------------------------

import java.util.Scanner;

public class BarGraph1_CBA
{
   public static void main(String[] args)
   {
   
     // Name your scanner
      Scanner input = new Scanner(System.in);   
   
      System.out.println("|*|*|*|*| Program BarGraph1 |*|*|*|*|\n");
      
        // Create your variable
      int counter = 1, num;
      
        // Create your array
      int[] asterisks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
             
        // Create your loop
      do{
         System.out.print("Enter value number " + (counter) + ": ");
         num = input.nextInt();
         if(num >= 1 && num <= 10){
            asterisks[0]++;
         }
         if(num >= 11 && num <= 20){
            asterisks[1]++;
         }
         if(num >= 21 && num <= 30){
            asterisks[2]++;
         }
         if(num >= 31 && num <= 40){
            asterisks[3]++;
         }
         if(num >= 41 && num <= 50){
            asterisks[4]++;
         }
         if(num >= 51 && num <= 60){
            asterisks[5]++;
         }
         if(num >= 61 && num <= 70){
            asterisks[6]++;
         }
         if(num >= 71 && num <= 80){
            asterisks[7]++;
         }
         if(num >= 81 && num <= 90){
            asterisks[8]++;
         }
         if(num >= 91 && num <= 100){
            asterisks[9]++;
         }
         counter++;
        }while(num != 0);
      System.out.println();
      System.out.printf("%2d - ",1);
      System.out.printf("%3d | ",10);
      for(int i = 0; i < asterisks[0]; i++){
      System.out.print("*");
      }
      System.out.println();
      
      System.out.printf("%2d - ",11);
      System.out.printf("%3d | ",20);
      for(int i = 0; i < asterisks[1]; i++){
      System.out.print("*");
      }
      System.out.println();
      
      System.out.printf("%2d - ",21);
      System.out.printf("%3d | ",30);
      for(int i = 0; i < asterisks[2]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",31);
      System.out.printf("%3d | ",40);
      for(int i = 0; i < asterisks[3]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",41);
      System.out.printf("%3d | ",50);
      for(int i = 0; i < asterisks[4]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",51);
      System.out.printf("%3d | ",60);
      for(int i = 0; i < asterisks[5]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",61);
      System.out.printf("%3d | ",70);
      for(int i = 0; i < asterisks[6]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",71);
      System.out.printf("%3d | ",80);
      for(int i = 0; i < asterisks[7]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",81);
      System.out.printf("%3d | ",90);
      for(int i = 0; i < asterisks[8]; i++){
      System.out.print("*");
      }
      System.out.println();
      System.out.printf("%2d - ",91);
      System.out.printf("%3d | ",100);
      for(int i = 0; i < asterisks[9]; i++){
      System.out.print("*");
      }
      System.out.println();
   }
}