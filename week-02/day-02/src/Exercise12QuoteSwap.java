import java.util.*;

public class Exercise12QuoteSwap {

  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().
    // Also, print the sentence to the output with spaces in between.
    // Expected output: "What I cannot create I do not understand."

    quoteSwap(list);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
  public static ArrayList quoteSwap (ArrayList quoteToCorrect) {
    Collections.swap(quoteToCorrect, 2, 5);
    return quoteToCorrect;
  }
}