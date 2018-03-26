import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise08 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer,Integer> frequencies = new HashMap<>();
    for (int n : numbers)
      frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
    System.out.println(frequencies);

    System.out.println("");

    System.out.println(numbers
            .stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting())));
  }
}
