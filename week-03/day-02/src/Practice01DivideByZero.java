import java.util.Scanner;

public class Practice01DivideByZero {

  // Create a function that takes a number
  // divides ten with it,
  // and prints the result
  // It should print "fail" if the parameter is 0

  public static void main(String[] args){

    System.out.println("Please give an integer");
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();
    int dividend = 10;
    try {
      System.out.println(dividend / divisor);
    } catch (ArithmeticException e){
      System.out.println("fail");
    }
  }
}
