import java.util.ArrayList;

public class Exercise05 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    String stringToCheck = "abcErT kfHinJ";

    for (int i = 0; i < stringToCheck.length(); i++) {
      if (Character.isUpperCase(stringToCheck.charAt(i))) {
        System.out.print(stringToCheck.charAt(i) + " ");
      }
    }

    System.out.println("");

    stringToCheck
            .chars()
            .mapToObj(c -> (char) c)
            .filter(c -> Character.isUpperCase(c))
            .map(c -> c + " ")
            .forEach(System.out::print);
  }
}
