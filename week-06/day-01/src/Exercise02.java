import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02 {
  public static void main(String[] args) {

    //Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    int result = 0;
    int counter = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        result += numbers.get(i);
        counter++;
      }
    }
    System.out.println(result/counter);

    numbers
            .stream()
            .filter(n -> n % 2 == 1)
            .mapToInt(n -> n)
            .average()
            .ifPresent(System.out::println);

    double oddAverage = numbers
            .stream()
            .filter(n -> n % 2 == 1)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();
    System.out.println(oddAverage);
  }
}
