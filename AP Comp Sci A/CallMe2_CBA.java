
//-----------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 9/24/19
//
// Title: CallMe2
//
// Description: This program generates and displays
// two different 10 digit phone numbers.
//
//----------------------------------------- 

  // Insert your random class
import java.util.Random;

public class CallMe2_CBA
{
   public static void main(String[] args)
   {
        // Name your random class 
      Random generator = new Random(); 
      
        // Create variables for your Random phone number  
      int rf3 = generator.nextInt(800) + 200;
      int rs3 = generator.nextInt(800) + 200;
      int r41 = generator.nextInt(10);
      int r42 = generator.nextInt(10);
      int r43 = generator.nextInt(10);
      int r44 = generator.nextInt(10);
      
        // Print the Random phone number
      System.out.print("Using the \"Random\" class: " + rf3 + "-" + rs3);
      System.out.println("-" + r41 + r42 + r43 + r44);
      
        // Print the Math phone number
      System.out.print("Using the \"Math\" class:   ");
      System.out.print((int) (Math.random() * 800 + 200) + "-");
      System.out.print((int) (Math.random() * 800 + 200) + "-");
      System.out.print ((int) (Math.random() * 10));
      System.out.print ((int) (Math.random() * 10));
      System.out.print ((int) (Math.random() * 10));
      System.out.print ((int) (Math.random() * 10));
   
   
   
   }
}