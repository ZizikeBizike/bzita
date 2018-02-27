import java.nio.file.*;
import java.io.IOException;

public class Practice03CountLines {

  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.

  public static void main(String[] args){
    String fileName = "file.txt";
    System.out.println(lineCounter(fileName));
  }

  public static int lineCounter (String file){

    Path filePath = Paths.get("file");
    int lines = 0;
    try {
      for (String linesCounter : Files.readAllLines(filePath)) {
        lines++;
        System.out.println(lines);
      }
      return lines;
    } catch (Exception e){
      return 0;
    }
  }
}
