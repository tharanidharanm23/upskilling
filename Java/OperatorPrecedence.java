/*

8. Operator Precedence
• Objective: Explore how Java evaluates expressions.
• Task: Evaluate and display the result of complex expressions.
• Instructions:
o Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;.
o Display the result and explain the order of operations.


*/
public class OperatorPrecedence {

	public static void main(String[] args) {

		int a = 10 + 5 * 2;
		int b = (10 + 5) * 2;
		int c = 20 / 2 + 3 * 4;
		int d = 8 + 2 * 3 - 4 / 2;

		System.out.println("10 + 5 * 2 = " + a);
		System.out.println("(10 + 5) * 2 = " + b);
		System.out.println("20 / 2 + 3 * 4 = " + c);
		System.out.println("8 + 2 * 3 - 4 / 2 = " + d);
	}
}