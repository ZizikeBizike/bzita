import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram testAnagram = new Anagram();

  @Test
  public void isAnagram() {
    assertTrue(testAnagram.isAnagram("dog", "god"));
  }

  @Test
  public void isAnagramOneWord() {
    assertTrue(testAnagram.isAnagram("dog", "dog"));
  }

  @Test
  public void isAnagramLowerAndUpperCase() {
    assertTrue(testAnagram.isAnagram("Hello", "hello"));
  }

  @Test
  public void isAnagramLongWords() {
    assertTrue(testAnagram.isAnagram("abcDfKijreLtTHA", "dCBfakIJtaHlrET"));
  }

  @Test
  public void isAnagramNegative() {
    assertFalse(testAnagram.isAnagram("abcDfKijreLtTH", "dCBfakIJtaHlrET"));
  }
}