import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise07 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the frequency of characters in a given string!

    String characterFrequency = "abskIsJLvnavassIJt";

    Map<Character,Integer> frequencies = new HashMap<>();
    for (char ch : characterFrequency.toCharArray())
      frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
    System.out.println(frequencies);

    System.out.println("");

    System.out.println(characterFrequency
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
  }
}
