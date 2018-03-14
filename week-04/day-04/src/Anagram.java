import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please give one word");
    String word1 = scanner.next();
    System.out.println("Please give another word");
    String word2 = scanner.next();

    System.out.println(isAnagram(word1, word2));
  }

  public static boolean isAnagram(String inputWord1, String inputWord2) {
    boolean anagram = true;
    if (inputWord1.length() != inputWord2.length()) {
      anagram = false;
    } else if (!sortString(inputWord1).equals(sortString(inputWord2))) {
      anagram = false;
    }
    return anagram;
  }

  public static String sortString (String stringToSort) {
    char[] tempArray = stringToSort.toLowerCase().toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }
}
