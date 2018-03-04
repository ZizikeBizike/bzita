import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Exercise01CopyFile {

  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    String fileCopyFrom = "fileCopyFrom.txt";
    String fileCopyTo = "fileCopyTo.txt";
    System.out.println(successfulCopy(fileCopyFrom, fileCopyTo));
  }

  public static boolean successfulCopy (String fileCopyFrom, String fileCopyTo) {
    Path pathCopyFrom = Paths.get(fileCopyFrom);
    Path pathCopyTo = Paths.get(fileCopyTo);
    boolean success = false;

    try {
      Files.copy(pathCopyFrom, pathCopyTo, REPLACE_EXISTING);
      success = true;
    } catch (Exception e) {
      System.out.println("Copying of the file is unsuccessful");
    }
    return success;
  }
}










//try {
//      List<String> listFile1 = Files.readAllLines(path1);
//      List<String> listFile2 = Files.readAllLines(path2);
//      return (listFile1.containsAll(listFile2));
//
//    } catch (Exception ex){
//      System.out.println("Cannot compare the two files");
//    }



//byte[] f1 = Files.readAllBytes(file1);
//byte[] f2 = Files.readAllBytes(file2);
//equals
//public static boolean equals(Object[] a,
//                             Object[] a2)
//Returns true if the two specified arrays of Objects are equal to one another. The two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. Two objects e1 and e2 are considered equal if (e1==null ? e2==null : e1.equals(e2)). In other words, the two arrays are equal if they contain the same elements in the same order. Also, two array references are considered equal if both are null.
//Parameters:
//a - one array to be tested for equality
//a2 - the other array to be tested for equality
//Returns:
//true if the two arrays are equal
