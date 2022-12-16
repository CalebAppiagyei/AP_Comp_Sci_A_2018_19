
//---------------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 12/3/2019
//
// Title: Multiplication Table
//
// Description: This program prints a multiplication
// table using nested for loops
//
//----------------------------------------------------

public class MultTable_CBA 
{
   public static void main(String args[])
   {
   
     // Create your variables
      int ans;
   
   
      System.out.println(" X     1   2   3   4   5   6   7   8   9  10");
      System.out.println("     ----------------------------------------");
      
        // Use two nested for loops to print your table
      for (int i = 1; i < 11; i++){
         System.out.printf("%2d | ",i);
         for (int j = 1; j < 11; j++){
            ans = i * j; 
            System.out.printf("%3d ",ans);
         }
         System.out.println();
      }
   }
}