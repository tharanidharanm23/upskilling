/*

15. String Reversal
• Objective: Manipulate strings.
• Task: Reverse a string entered by the user.
• Instructions:
o Prompt the user for a string.
o Use a loop or StringBuilder to reverse the string.
o Display the reversed string.

*/
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scn.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}