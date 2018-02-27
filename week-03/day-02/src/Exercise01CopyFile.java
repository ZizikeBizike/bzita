import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Exercise01CopyFile {

  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    String file1 = "myFile1.txt";
    String file2 = "myFile2.txt";
    succesfulCopy(file1, file2);
  }
  public static boolean succesfulCopy (String fileOne, String fileAnother) {
    Path path1 = Paths.get(fileOne);
    Path path2 = Paths.get(fileAnother);
    try {
      Files.copy(path1, path2, REPLACE_EXISTING);
    } catch (Exception e) {
      System.out.println("Copying the file is unsuccessful");
    }
    return (fileOne == fileAnother);
  }
}
