import java.util.ArrayList;
import java.util.Arrays;

public class Exercise03 {
  public static void main(String[] args) {

    //Write a Stream Expression to get the squared value of the positive numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    for (int i = 0; i < numbers.size(); i++) {
      int squareOfNumber;
      if (numbers.get(i) > 0) {
        squareOfNumber = numbers.get(i) * numbers.get(i);
        System.out.print(squareOfNumber + " ");
      }
    }

    System.out.println("");

    numbers
            .stream()
            .filter(n -> n > 0)
            .map(n -> n * n + " ")
            .forEach(System.out::print);
  }
}
