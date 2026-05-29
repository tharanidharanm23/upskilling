/*

4. Leap Year Checker
• Objective: Apply nested conditional logic.
• Task: Check if a given year is a leap year.
• Instructions:
o Prompt the user to enter a year.
o A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
o Display the result accordingly.

*/

import java.util.Scanner;
public class leapYear {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    
	   System.out.print("Enter a year: ");
	   int year = scn.nextInt();
	   
	   String res = checkLeap(year);
	   System.out.println("Result:"+ res);
	   

		
	}
	static String checkLeap(int year){
	    
        if((year%4 == 0 && year%100 != 0) || (year % 400 == 0)){
            return "Leap Year";  
        }else{
            return "Not a Leap Year";
        }
	    
    }
}