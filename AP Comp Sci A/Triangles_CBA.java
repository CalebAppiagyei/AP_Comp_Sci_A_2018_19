
//---------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 10/10/19
//
// Program: Triangles
//
// Description: This program determines whether three different 
// lengths could make a triangle(and if they can make a right triangle)
//
//---------------------------------------

  // import your Scanner class 
import java.util.Scanner;

public class Triangles_CBA
{
   public static void main(String[] args)
   {
        // Name your Scanner class
      Scanner input = new Scanner(System.in);
      
        // Create your variables
      double a, b, c, ab, ac, bc, temp1, temp2, pyt, csqr;
      
      System.out.println("\n(a)(b)(c) Program Triangles (c)(b)(a)");
      
        // Ask the user for the lengths of their triangle 
      System.out.print("\nEnter length of side a: ");
      a = input.nextDouble();
      System.out.print("Enter length of side b: ");
      b = input.nextDouble();
      System.out.print("Enter length of side c: ");
      c = input.nextDouble();
      
        // Organize the sides from least to greatest
      if ( a > b || a > c ){
         if ( a > b ) {
            temp1 = a;
            a = b; 
            b = temp1;
         }
         if ( a > c ) {
            temp1 = a;
            a = c;
            c = temp1;
         }
      } 
      
      if ( b > c ) {
         temp2 = b;
         b = c;
         c = temp2;
      }
      
        // Add the sides
      ab = a + b;
      ac = a + c;
      bc = b + c;

      
        // Pythagorean Theorem
      pyt = (a * a) + (b * b);
      csqr = c * c;
      
        // Print your results
      if ( ab > c && ac > b && bc > a) {
         if ( csqr == pyt ) {
            System.out.println("\nIt's a right triangle!");
         } 
         else {
            System.out.println("\nIt's a triangle, but not a right triangle!");
         }   
      }
      
      else {
         System.out.println("\n Sorry! It's not a triangle!");
      }
   }
}