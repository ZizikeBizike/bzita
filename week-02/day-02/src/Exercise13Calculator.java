import java.util.Scanner;

public class Exercise13Calculator {

  public static void main(String... args) {

    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    System.out.println("Please type in the expression: operation operand operand (eg: + 6 3)");
    calculate();
  }
  public static void calculate() {
    Scanner scanner = new Scanner(System.in);
    String operation = scanner.next();
    int operand1 = scanner.nextInt();
    int operand2 = scanner.nextInt();
    int result = 0;

    if (operation.equals("+")) {
      result = operand1 + operand2;
    } else if (operation.equals("-")) {
      result = operand1 - operand2;
    } else if (operation.equals("*")) {
      result = operand1 * operand2;
    } else if (operation.equals("/")) {
      result = operand1 / operand2;
    } else if (operation.equals("%")) {
      result = operand1 % operand2;
    }
    System.out.println("The result is " + result);
  }
}