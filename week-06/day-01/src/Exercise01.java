import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {
  //Write a Stream Expression to get the even numbers from the following array:

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
        System.out.print(numbers.get(i) + " ");
      }
    }
    System.out.println("");

    numbers
            .stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n + " ")
            .forEach(System.out::print);
  }
}
