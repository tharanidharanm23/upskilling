/******************************************************************************

25. HashMap Example
• Objective: Use key-value pairs.
• Task: Map student IDs to names.
• Instructions:
o Create a HashMap with Integer keys and String values.
o Allow the user to add entries.
o Retrieve and display a name based on an entered ID.


*******************************************************************************/

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("How many entries? ");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter Name: ");
            String name = scn.nextLine();

            students.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = scn.nextInt();

        System.out.println("Student Name: " + students.get(searchId));
    }
}