
//-----------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 9/18/19
//
// Period: 3
// 
// Description: Prompts a first and last name, 
// prints the name and a greeting
//-----------------------------------------

  // Insert your scanner
import java.util.Scanner;

public class Greetings2_CBA {
   public static void main(String[] args){
   
     // Name your Scanner
   Scanner input = new Scanner(System.in);
   
   System.out.println();
   
     // Ask the user for their first and last name 
   System.out.print("Enter your first name: ");
   String fname = input.nextLine();
   System.out.print("Enter your last name: ");
   String lname = input.nextLine();
   
   System.out.println();
   
   System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
   
     // Print out a greeting
   System.out.println("\nGreetings, " + fname + " " + lname + "! Welcome to Java!");
   
   
   
   }
}