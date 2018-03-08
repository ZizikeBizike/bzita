import java.util.ArrayList;

public class Sum {

  public static void main(String[] args) {
    ArrayList<Integer> sum = new ArrayList<Integer>();
    sum.add(119);
    sum.add(57);
    sum.add(7);
    sum.add(38);
    sum.add(8);
    sum.add(11);

    System.out.println(sumNumbers(sum));
  }

  public static int sumNumbers(ArrayList<Integer> inputNumbers) {
    int result = 0;
    for(int i = 0; i < inputNumbers.size(); i++) {
      result += inputNumbers.get(i);
    }
    return result;
  }
}
