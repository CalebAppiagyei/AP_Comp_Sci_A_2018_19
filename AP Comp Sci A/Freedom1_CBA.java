
//---------------------------------------------
//
// Name: Caleb Appiagyei
//
// Date: 1/22/20
//
// Program: Freedom 1
//
// Description: This program uses two dates and
// determines how many days are between them.
//
//----------------------------------------------

  // Insert your scanner
import java.util.Scanner;

public class Freedom1_CBA 
{
   public static void main(String[] args)
   {
        
        // Name your Scanner
      Scanner input = new Scanner(System.in);
      
        // Create your variables
      int month1, date1, year1, month2, date2, year2, yearcounter = 0, monthcounter = 0, datecounter = 0;
      
      System.out.println("---------- How Many Days? ----------");
      
        // Ask the user for their first date
      System.out.print("\nEnter the year of today's date(ex.2020): ");
      year1 = input.nextInt();
      
      System.out.print("\nEnter the month of today's date in numerical form(ex. 1 for January): ");
      month1 = input.nextInt();
        // Make sure the user enters a real month
      while( month1 > 12 ){
         System.out.print("Please enter a different month: ");
         month1 = input.nextInt();
      }
      
      System.out.print("\nEnter today's date(ex. 21): ");
      date1 = input.nextInt(); 
        // Make sure the user uses a realistic date
      while ( (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12) && date1 > 31){
         System.out.print("Please enter a different date: ");
         date1 = input.nextInt();
      }
      while ( month1 == 2 && date1 > 28){
         System.out.print("Please enter a different date: ");
         date1 = input.nextInt();
      }
   
      
         // Ask the user for their second date
      System.out.print("\nEnter the year of your second date(ex.2020): ");
      year2 = input.nextInt();
      while( year2 < year1){
         System.out.print("Please enter a new year: ");
         year2 = input.nextInt();
      }
      
      System.out.print("\nEnter the month of your second date in numerical form(ex. 1 for January): ");
      month2 = input.nextInt();
      while( month2 > 12  || (month2 < month1 && year2 == year1) ){
         System.out.print("Please enter a different month: ");
         month2 = input.nextInt();
      }
   
      System.out.print("\nEnter the date of your second date(ex. 21): ");
      date2 = input.nextInt(); 
      while ( (month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) && date2 > 31){
         System.out.print("Please enter a different date: ");
         date2 = input.nextInt();
      }
      while ( month2 == 2 && date2 > 28){
         System.out.print("Please enter a different date: ");
         date2 = input.nextInt();
      }
      while (month1 == month2 && date2 < date1 && year1 == year2){
         System.out.print("Please enter a different date: ");
         date2 = input.nextInt();
      }
   
      
      System.out.print("\n-------------------------------------------------------------------------------");
      
      int days = 0;  
        // Determine whether there are leap years 
      if ( year1 < year2){  
         for( int x = year1; x < (year2+1); x++){
            int remainder4 = x % 4;
            int remainder400 = x % 400;
            int remainder100 = x % 100;
            if ( x < 1582){
               x = year2;
            }
            if ( x >= 1582 ) {
               if ( remainder4 == 0 && remainder100 != 0 ){
                  days++; 
               }
               else if ( remainder400 == 0 ) {
                  days++;   
               }
            } 
         }
      }
        // Calculate how many years are between each date
      int years = year2 - year1;  
      if( (years) > 0 && (month2 - month1) >= 0){  
         for( int i = 0; i < year2 - year1; i++){
            yearcounter++;
         }
      }
      
      int months = month2 - month1;
        // Calculate the months if there is more than a one month difference
      if(months > 1 && date2 >= date1){
         for( int j = month1; j < month2; j++){
            monthcounter++;
         }
         for(int y = month1+1; y < month2; y++){
            if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)
               datecounter++;
         }
         datecounter = datecounter + (date2-date1);
      }
        // Calulate the months if there is more than a one month difference but the second date is less than the first one
      if(months > 1 && date2 < date1){
            // If the month has 31 days
         if(month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12){
            for(int k = date1; k < 32; k++){
               datecounter++;
            }
                       
            datecounter = datecounter + date2;
            
         }
           // If the month is February
         if(month1 == 2){
            for(int c = date1; c < 29; c++){
               datecounter++;
            }    
            datecounter = datecounter + date2 + 1;
         }
           // If the month has 30 days
         if(month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11){
            for(int z = date1; z < 31; z++){
               datecounter++;
            }    
            datecounter = datecounter + date2 + 1;
         }
         monthcounter = monthcounter + (months - 1);
      }
        
        // Calculate the months if the dates cross over a year
      if(years == 1 && month2 < month1){
         for( int h = month1 + 1; h < 13; h++){
            monthcounter++;
            if(h == 1 || h == 3 || h == 5 || h == 7 || h == 8 || h == 10 || h == 12){
               datecounter++;
            }
         }
         monthcounter = monthcounter + month2;
      }
        // Calculate the days if there are multiple years in between dates but one month is earlier then the other 
      if(years > 1 && month2 < month1){
         yearcounter = years - 1;
         for( int h = month1; h < 13; h++){
            monthcounter++;
            if(h == 1 || h == 3 || h == 5 || h == 7 || h == 8 || h == 10 || h == 12){
               datecounter++;
            }
         }
      }
        // Calculate the days if there is less than a one month difference
      if(months == 1){
           // If the month has 31 days
         if(month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12){
            for(int k = date1 + 1; k < 32; k++){
               datecounter++;
            }
                       
            datecounter = datecounter + date2;
            
         }
           // If the month is February
         if(month1 == 2){
            for(int c = date1 + 1; c < 29; c++){
               datecounter++;
            }    
            datecounter = datecounter + date2 + 1;
         }
         if(month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11){
            for(int z = date1 + 1; z < 31; z++){
               datecounter++;
            }    
            datecounter = datecounter + date2 + 1;
         }
      
      }
        // Calculate the days if the dates are in the same month
      if(months == 0){
         datecounter = date2 - date1;
      }
        // Add up all the days
      datecounter = datecounter + days;
      
        // adjust the days and months if they are greater than 30 or 12
      if(monthcounter >= 12){
         int temp = monthcounter;
         while ((temp % 12) == 0 && temp > 0){
            yearcounter++;
            monthcounter = monthcounter - 12;
            temp = temp - 12;
         }
      }
      if(datecounter >= 30){
         while(datecounter >= 30 && datecounter > 0){
            datecounter = datecounter - 30;
            monthcounter++;
         }
         int temp2 = datecounter;
         while ((temp2 % 30) == 0 && temp2 > 0){
            monthcounter++;
            datecounter = datecounter - 30;
            temp2 = temp2 - 30;
         }
      }
   
      
      System.out.println("\nThere are.....");
      System.out.println("\nYears: " + yearcounter);
      System.out.println("\nMonths: " + monthcounter);
      System.out.println("\nDays: " + datecounter);
      System.out.println();
      System.out.println("between " + month1 + "/" + date1 + "/" + year1 + " and " + month2 + "/" + date2 + "/" + year2 + ".\n\n\n");
      System.out.print("********** Disclaimer: A month refers to 30 days **********");
   }
}