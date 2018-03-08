import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram testAnagram = new Anagram();

  @Test
  public void testIsAnagram() {
    assertTrue(testAnagram.isAnagram("dog", "god"));
  }

  @Test
  public void testIsAnagramOneWord() {
    assertTrue(testAnagram.isAnagram("dog", "dog"));
  }

  @Test
  public void testIsAnagramLowerAndUpperCase() {
    assertTrue(testAnagram.isAnagram("Hello", "hello"));
  }

  @Test
  public void testIsAnagramLongWords() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTHA", "dCBfakIJtaHlrET"));
  }

  @Test
  public void testIsAnagramNegative() {
    assertFalse(testAnagram.isAnagram("abcDfKijreLtTH", "dCBfakIJtaHlrET"));
  }

  @Test (expected = java.lang.AssertionError.class)
  public void testIsAnagramEmptyString() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTH", ""));
  }

  @Test (expected = java.lang.NullPointerException.class)
  public void testIsAnagramNull() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTH", null));
  }
}