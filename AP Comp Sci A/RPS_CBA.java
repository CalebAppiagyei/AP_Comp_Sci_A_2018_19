
//--------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 10/21 /19
//
// Title: Rock Paper Scissors
//
// Description: This program creates a
// Rock Paper Scissors game
//
//--------------------------------------

import java.util.*;


public class RPS_CBA 
{
   public static void main(String[] args)
   {
   
     // Name Your Scanner
      Scanner input = new Scanner (System.in);
     // Name your Random
      Random generator = new Random();
      
        // 0 = r 1 = p 2 = s
      int mchoice = generator.nextInt(3);
      char uchoice;
   
      System.out.println("\n(R)(P)(S) ---- Rock-Paper-Scissors ---- (S)(P)(R)");
   
      System.out.print("\nEnter your choice (R, P, or S): ");
      uchoice = input.next().charAt(0);
      
      if  (uchoice != 'r' && uchoice != 'R' && uchoice != 'P' && uchoice != 'p' && uchoice != 'S' && uchoice != 's') {
         while ( uchoice != 'r' && uchoice != 'R' && uchoice != 'P' && uchoice != 'p' && uchoice != 'S' && uchoice != 's'){
            System.out.print("\nInvalid choice!\n");
            System.out.print("\nEnter your choice (R, P, or S): ");
            uchoice = input.next().charAt(0);
         }
      }
      
      if ( uchoice == 'R' || uchoice == 'r' || uchoice == 'P' || uchoice == 'p' || uchoice == 'S' || uchoice == 's'){
         if ( mchoice == 0 ) {
            System.out.println("\nMachine's choice: Rock!");
         }
      
         if ( mchoice == 1 ) {
            System.out.println("\nMachine's choice: Paper!");
         }
         if ( mchoice == 2 ) {
            System.out.println("\nMachine's choice: Scissors!");
         }
      }
      if ( uchoice == 'R' || uchoice == 'r') {
         if ( mchoice == 0){
            System.out.print("\nDraw!\n");
         } 
         
         if ( mchoice == 1){
            System.out.print("\nPaper covers rock! You lose!\n");
         } 
         
         if ( mchoice == 2){
            System.out.print("\nRock beats scissors! You win!\n");
         }
      }
        
      if ( uchoice == 'P' || uchoice == 'p') {
         if ( mchoice == 0){
            System.out.print("\nPaper covers rock! You win!");
         } 
         
         if ( mchoice == 1){
            System.out.print("\nDraw!\n");
         } 
         
         if ( mchoice == 2){
            System.out.print("\nScissors cuts paper! You lose!\n");
         }
      }
        
      if ( uchoice == 'S' || uchoice == 's') {
         if ( mchoice == 0){
            System.out.print("\nRock beats scissors! You lose!");
         } 
         
         if ( mchoice == 1){
            System.out.print("\nScissors cuts paper! You win!\n");
         } 
         
         if ( mchoice == 2){
            System.out.print("\nDraw!\n");
         }
      }
   }
}