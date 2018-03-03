import java.util.Scanner;

public class ExerciseNumber34 {
  public static void main(String[] args) {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int numberOfNumbers = scanner.nextInt();
    int numbers;
    double sum = 0;
    for (int i = 0; i < numberOfNumbers; i++) {
      System.out.println("Please enter an integer");
      numbers = scanner.nextInt();
      sum = sum + numbers;
    }
    System.out.println("The sum of the numbers is " + sum);
    System.out.println("The average of the numbers is " + sum/numberOfNumbers);
  }
}
