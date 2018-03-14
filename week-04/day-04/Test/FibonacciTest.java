import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci testFibonacci = new Fibonacci();

  @Test
  public void testCountFibonacci() {
    assertEquals(120, testFibonacci.countFibonacci(5));
  }

  @Test
  public void testCountFibonacciNegative() {
    assertNotEquals(110, testFibonacci.countFibonacci(5));
  }


}