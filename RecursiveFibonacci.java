/*

13. Recursive Fibonacci
• Objective: Implement recursion.
• Task: Calculate the nth Fibonacci number using recursion.
• Instructions:
o Prompt the user for a positive integer n.
o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number.
o Display the result.



*/
import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scn.nextInt();

        System.out.println("Postion :" + n + " ,Fibonacci number is " + fibonacci(n));
    }
}