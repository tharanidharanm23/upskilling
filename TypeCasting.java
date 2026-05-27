/*

7.Type Casting Example
• Objective: Practice type casting between different data types.
• Task: Convert a double to an int and vice versa.
• Instructions:
o Declare a double variable with a decimal value.
o Cast it to an int and display the result.
o Declare an int variable and cast it to a double, then display.

*/
public class TypeCasting {

    public static void main(String[] args) {

        double d = 45.89;
        int num = (int) d;

        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + num);

        int a = 25;
        double value = (double) a;

        System.out.println("Integer value: " + a);
        System.out.println("After casting to double: " + value);
    }
}