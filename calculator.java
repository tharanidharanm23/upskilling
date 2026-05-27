/*

2. Simple Calculator
• Objective: Practice arithmetic operations and user input.
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division.
• Instructions:
o Prompt the user to enter two numbers.
o Ask the user to choose an operation.
o Display the result of the operation.
*/

import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    
	   System.out.print("Enter 2 numbers: ");
	   int a = scn.nextInt();
	   int b = scn.nextInt();
	   
	   System.out.print("Enter operation to perform: ");
	   char opr = scn.next().charAt(0);
	   
	   int res = calculate(a,b,opr);
	   System.out.println("Result:"+ res);
	   

		
	}
	static int calculate(int a, int b, char opr){
	    
	    switch(opr){
	       case '+':
	            return a+b;
	            
	       case '-':
	            return a-b;
	            
	       case '*':
	           return a*b;
	           
	       case '/':
	           if(b>0){
	               System.out.println("Cannot divisible by 0");
	           }else{
	               return 0;
	           }
	           
	       default:
	           System.out.println("Invalid Operation");
	           return 0;
	    }
	    
	    
	    
	}
}