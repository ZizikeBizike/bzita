import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram testAnagram = new Anagram();

  @Test
  public void testIsAnagram() {
    assertTrue(testAnagram.isAnagram("dog", "god"));
  }

  @Test
  public void testIsAnagramSameWord() {
    assertTrue(testAnagram.isAnagram("dog", "dog"));
  }

  @Test
  public void testIsAnagramSameLettersDifferentAmounts() {
    assertFalse(testAnagram.isAnagram("abcd", "dcbbaa"));
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

  @Test
  public void testIsAnagramLetterOnly() {
    assertTrue(testAnagram.isAnagram("d", "d"));
  }

  @Test
  public void testIsAnagramDifferentNumberOfLetters() {
    assertFalse(testAnagram.isAnagram("dd", "d"));
  }

  @Test
  public void testIsAnagramNumbers() {
    assertTrue(testAnagram.isAnagram("23d5", "5d32"));
  }

  @Test
  public void testIsAnagramSpecialCharacters() {
    assertTrue(testAnagram.isAnagram("*%=;!", "!*;=%"));
  }

  @Test
  public void testIsAnagramStringsWithEqualAmountOfSpaces() {
    assertTrue(testAnagram.isAnagram("  ", "  "));
  }

  @Test
  public void testIsAnagramStringsWithDifferentAmountOfSpaces() {
    assertFalse(testAnagram.isAnagram("  ", "   "));
  }

  @Test
  public void testIsAnagramWordsWithSpace() {
    assertFalse(testAnagram.isAnagram("Hello", "hell o"));
  }
}