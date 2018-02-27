import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Practice05WriteMultipleLines {

  // Create a function that takes 3 parameters: a path, a word and a number,
  // than it should write to a file.
  // The path parameter should be a string, that describes the location of the file.
  // The word parameter should be a string, that will be written to the file as lines
  // The number parameter should describe how many lines the file should have.
  // So if the word is "apple" and the number is 5, than it should write 5 lines
  // to the file and each line should be "apple"
  // The function should not raise any error if it could not write the file.

  public static void main(String[] args){

    String myPath = "myFile.txt";
    String myWord = "apple";
    int myNumber = 5;

    writesInFile(myPath, myWord, myNumber);
  }
  public static void writesInFile (String path, String word, int number){
    Path realPath = Paths.get(path);
    List<String> text = new ArrayList();
    for (int i = 0; i < number; i++) {
      text.add(word);
    }
    try{
      Files.write(realPath, text);
    } catch (Exception e){
      System.out.println("Could not write myFile");
    }
  }
}
