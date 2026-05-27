/*

3. Even or Odd Checker
• Objective: Utilize conditional statements.
• Task: Determine if a number entered by the user is even or odd.
• Instructions:
o Prompt the user for an integer.
o Use the modulus operator % to check divisibility by 2.
o Display whether the number is even or odd.


*/

import java.util.Scanner;
public class oddOrEven {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    
	   System.out.print("Enter a number: ");
	   int num = scn.nextInt();
	   
	   String res = check(num);
	   System.out.println("Result:"+ res);
	   

		
	}
	static String check(int num){
	    
        if(num % 2 == 0){
            return "Even";  
        }else{
            return "Odd";
        }
	    
    }
}