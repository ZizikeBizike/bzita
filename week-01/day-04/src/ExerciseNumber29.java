import java.util.Scanner;

public class ExerciseNumber29 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give an integer");
    int triangleStarNumber = scanner.nextInt();

    for (int i = 0; i < 2 * triangleStarNumber; i = i + 2) {
      for (int k = 1; k < triangleStarNumber - i / 2; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
