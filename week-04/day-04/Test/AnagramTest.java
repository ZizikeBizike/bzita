import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram testAnagram = new Anagram();

  @Test
  public void testIsAnagram() {
    assertTrue(testAnagram.isAnagram("dog", "god"));
  }

  @Test
  public void TestIsAnagramOneWord() {
    assertTrue(testAnagram.isAnagram("dog", "dog"));
  }

  @Test
  public void testIsAnagramLowerAndUpperCase() {
    assertTrue(testAnagram.isAnagram("Hello", "hello"));
  }

  @Test
  public void TestIsAnagramLongWords() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTHA", "dCBfakIJtaHlrET"));
  }

  @Test
  public void TestIsAnagramNegative() {
    assertFalse(testAnagram.isAnagram("abcDfKijreLtTH", "dCBfakIJtaHlrET"));
  }

  @Test (expected = java.lang.AssertionError.class)
  public void TestIsAnagramEmptyString() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTH", ""));
  }

  @Test (expected = java.lang.NullPointerException.class)
  public void TestIsAnagramNull() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTH", null));
  }
}