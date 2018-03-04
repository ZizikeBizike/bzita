import java.nio.file.*;

public class Practice03CountLines {

  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.

  public static void main(String[] args) {
    String fileName = "linesToCount.txt";
    System.out.println(lineCounter(fileName));
  }

  public static int lineCounter(String nameOfFileToCount) {
    try {
      int counter = 0;
      Path filePath = Paths.get(nameOfFileToCount);
      for (String linesToCount : Files.readAllLines(filePath)) {
        counter++;
      }
      return counter;
    } catch (Exception e) {
      return 0;
    }
  }
}

