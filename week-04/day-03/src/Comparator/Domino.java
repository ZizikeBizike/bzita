package Comparator;

public class Domino implements Comparable <Domino>, Printable {

  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int compareTo(Domino dm) {
    if (values[0] == dm.values[0])
      return 0;
    else if (values[0] > dm.values[0])
      return 1;
    else
      return -1;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  public void printAllFields(){
    System.out.println("[" + values[0] + ", " + values[1] + "]");
  }
}
