import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public boolean noArgs() {
    return args.length == 0;
  }

  public boolean isList() {
    return args[0].equals("-l");
  }

  public boolean isAdd() {
    return args[0].equals("-a");
  }

  public boolean isRemove() {
    return args[0].equals("-r");
  }

  public void noArgsPrinter() {
    System.out.println("Command Line Todo application\n" +
            "=============================\n" +
            "\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task");
  }

  public void listTasks() {
    try{
      File file = new File("todo.txt");
      if (file.length() == 0) {
        System.out.println("No todos for today! :)");
      } else {
        Path filePath = Paths.get("todo.txt");
        int counter = 0;
        for (String line : Files.readAllLines(filePath)) {
          counter++;
          System.out.println(counter + " -  " + line);
        }
      }
    } catch (IOException e){
      System.out.println("Cannot list file");
      e.printStackTrace();
    }
  }

  public void addTask() {
    try{
      File file = new File("todo.txt");
      Path filePath = Paths.get("todo.txt");
      String newTask;
      if (file.length() == 0) {
        newTask = args[1];
      } else {
        newTask = System.lineSeparator() + args[1];
      }
      Files.write(filePath, newTask.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e){
      System.out.println("Cannot write in file");
      e.printStackTrace();
    }
  }

  public void removeTask() {
    File file = new File("todo.txt");
    Path filePath = Paths.get("todo.txt");
    List<String>tasks = new ArrayList<>();
    try {
      tasks.addAll(Files.readAllLines(filePath));
      tasks.remove(Integer.parseInt(args[1])-1);
      Files.write(filePath, tasks);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}