import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum sumTest = new Sum();
  ArrayList<Integer> testList = new ArrayList<>();

  @Test
  public void sumNumbers() {
    testList.add(10);
    testList.add(35);
    testList.add(2);
    assertEquals(47, sumTest.sumNumbers(testList));
  }

  @Test
  public void sumNumbersEmptyList() {
    assertEquals(0, sumTest.sumNumbers(testList));
  }

  @Test
  public void sumNumbersOneElement() {
    testList.add(10);
    assertEquals(10, sumTest.sumNumbers(testList));
  }

  @Test
  public void sumNumbersMultipleElements() {
    int sumTestList;
    for (int i = 0; i < 20; i++) {
      testList.add(i);
    }
    assertEquals(190, sumTest.sumNumbers(testList));
  }

  @Test (expected = NullPointerException.class)
  public void sumNumbersWithNull() {
    int sumTestList;
    testList.add(null);
    assertEquals(null, sumTest.sumNumbers(testList));
  }
}