/**
 * 1684. Count the Number of Consistent Strings
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */

class Solution {

  public int countConsistentStrings(String allowed, String[] words) {
    int count = 0;

    Set<Character> allowedChars = new HashSet<Character>();

    for (int i = 0; i < allowed.length(); i++) {
      allowedChars.add(allowed.charAt(i));
    }

    for (int i = 0; i < words.length; i++) {
      boolean consistent = true;
      String curStr = words[i];
      for (int j = 0; j < curStr.length(); j++) {
        if (!allowedChars.contains(curStr.charAt(j))) {
          consistent = false;
          break;
        }
      }
      if (consistent) {
        count++;
      }
    }

    return count;
  }
}
