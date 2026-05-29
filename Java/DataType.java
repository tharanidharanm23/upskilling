/*

6. Data Type Demonstration
• Objective: Understand Java's primitive data types.
• Task: Declare variables of different primitive types and display their values.
• Instructions:
o Declare variables of types int, float, double, char, and boolean.
o Assign appropriate values to each.
o Use System.out.println() to display each variable.

*/
import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter integer value: ");
        int intNum = scn.nextInt();

        System.out.print("Enter float value: ");
        float floatNum = scn.nextFloat();

        System.out.print("Enter double value: ");
        double doubleNum = scn.nextDouble();

        System.out.print("Enter character value: ");
        char charValue = scn.next().charAt(0);

        System.out.print("Enter boolean value: ");
        boolean booleanValue = scn.nextBoolean();

        System.out.println("Integer value: " + intNum);
        System.out.println("Float value: " + floatNum);
        System.out.println("Double value: " + doubleNum);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}