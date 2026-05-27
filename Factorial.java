/*

11. Factorial Calculator
• Objective: Use loops to perform repetitive calculations.
• Task: Calculate the factorial of a number entered by the user.
• Instructions:
o Prompt the user for a non-negative integer.
o Use a for loop to calculate the factorial.
o Display the result.



*/
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scn.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}