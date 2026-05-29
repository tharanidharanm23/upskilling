/******************************************************************************

22. File Writing
• Objective: Write data to a file.
• Task: Write user input to a text file.
• Instructions:
o Prompt the user for a string.
o Write the string to a file named output.txt.
o Confirm that the data has been written.


*******************************************************************************/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scn.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();

            System.out.println("Data written to output.txt successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}