import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a positive integer");
    int indexFibonacci = scanner.nextInt();
    if (indexFibonacci < 0) {
      System.out.println("You need to give a positive integer");
    }
    System.out.println(countFibonacci(indexFibonacci));
  }

  public static int countFibonacci(int numberToUse){
    int result = 1;
    for (int i = 1; i <= numberToUse; i++) {
      result *= i;
    }
    return result;
  }
}
