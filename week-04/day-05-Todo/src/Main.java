public class Main {
  public static void main(String[] args) {

    ArgumentHandler argumentHandler = new ArgumentHandler(args);
    if(argumentHandler.noArgs()) {
      argumentHandler.noArgsPrinter();
    } else if (argumentHandler.isList()) {
      argumentHandler.listTasks();
    } else if (argumentHandler.isAdd()) {
      argumentHandler.addTask();
    } else if (argumentHandler.isRemove()) {
      argumentHandler.removeTask();
    }
  }
}

