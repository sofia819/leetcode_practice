/**
 * 1844. Replace All Digits with Characters
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 */

class Solution {

  public String replaceDigits(String s) {
    char[] c = s.toCharArray();

    for (int i = 1; i < s.length(); i += 2) {
      c[i] = shift(c[i - 1], c[i]);
    }

    return new String(c);
  }

  private char shift(char c, int digit) {
    return (char) (c + (digit - 48));
  }
}
