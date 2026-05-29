/******************************************************************************

29. Records
• Objective: Use the record keyword for immutable data structures (Java 16+).
• Task: Create a record to represent a Person with name and age.
• Instructions:
o Define a record named Person.
o Create instances and print them.
o Use records in a List and filter based on age using Streams.

*******************************************************************************/

import java.util.List;

record Person(String name, int age) {}

public class RecordsExample {

    public static void main(String[] args) {

        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 17);
        Person p3 = new Person("David", 30);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people = List.of(p1, p2, p3);

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}