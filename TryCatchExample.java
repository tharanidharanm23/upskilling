/*

20. Try-Catch Example
• Objective: Handle exceptions gracefully.
• Task: Handle division by zero using try-catch.
• Instructions:
o Prompt the user for two integers.
o Attempt to divide the first by the second.
o Catch any ArithmeticException and display an appropriate message

*/
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int a = scn.nextInt();

            System.out.print("Enter second number: ");
            int b = scn.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }
    }
}