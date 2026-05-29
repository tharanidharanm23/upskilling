/******************************************************************************

21. Custom Exception
• Objective: Create and use custom exceptions.
• Task: Define a custom exception InvalidAgeException.
• Instructions:
o Throw InvalidAgeException if the user's age is less than 18.
o Catch the exception and display a message

*******************************************************************************/

import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int age = scn.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Valid Age");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}