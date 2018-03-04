import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Exercise03Logs {

  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses.
  // Write a function that returns the GET / POST request ratio.

  public static void main(String[] args){

    List<String>lines = new ArrayList();
    try{
      Path filePath = Paths.get("log.txt");
      lines = Files.readAllLines(filePath);
    } catch (Exception e){
      System.out.println("Cannot put log.txt into a list");
    }
    IpAddresses(lines);
  }
  public static Arrays IpAddresses(List input){
    for(int i = 0; i < input.size(); i++){
      String addresses;
      ArrayList<String> addresses =
      addresses = input.substring(28, 39);

    }
  }
}
