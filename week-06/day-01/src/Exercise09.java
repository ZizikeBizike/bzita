import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise09 {
  public static void main(String[] args) {

    //Write a Stream Expression to convert a char array to a string!

    char[] characterList = {'Z', 'i', 't', 'a'};

    String word = new String(characterList);
    System.out.println(word);

    System.out.println("");

    Character[] characters = {'Z', 'i', 't', 'a'};

    String stringResult = Arrays.stream(characters)
            .map(Object::toString)
            .collect(Collectors.joining());
    System.out.println(stringResult);
  }
}
