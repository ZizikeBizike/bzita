import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    for (int i = 0; i < cities.size(); i++) {
      if (cities.get(i).startsWith("A") && cities.get(i).endsWith("I")) {
        System.out.print(cities.get(i) + " ");
      }
    }

    System.out.println("");

    cities
            .stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .map(s -> s + " ")              //if there were more than one, I would need this to print proprerly
            .forEach(System.out::print);
  }
}
