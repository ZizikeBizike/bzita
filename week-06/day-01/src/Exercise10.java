import java.util.Arrays;
import java.util.List;

public class Exercise10 {
  public static void main(String[] args) {

    //Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you
    // how you name/create them! Write a Stream Expression to find the foxes with green color!
    // Write a Stream Expression to find the foxes with green color and pallida type!

    List<Fox> foxes = Arrays.asList(
            new Fox("Fufu", "Pallida", "green"),
            new Fox("Fifi", "Corsac", "blue"),
            new Fox("Fofo", "Pallida", "red"),
            new Fox("Fefe", "Macrotis", "green"),
            new Fox("Fafa", "Macrotis", "orange"),
            new Fox("FanFan", "Pallida", "green"),
            new Fox("Fonfon", "Corsac", "green")
    );

    foxes
            .stream()
            .filter(fox -> fox.getColor().equals("green"))
            .forEach(fox -> System.out.println(fox.getName()));

    System.out.println("");

    foxes
            .stream()
            .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("Pallida"))
            .forEach(fox -> System.out.println(fox.getName()));
  }
}
