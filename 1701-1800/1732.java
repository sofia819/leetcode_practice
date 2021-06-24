/**
 * 1732. Find the Highest Altitude
 * https://leetcode.com/problems/find-the-highest-altitude/
 */

class Solution {

  public int largestAltitude(int[] gain) {
    int max = 0;
    int prev = max;

    for (int i = 0; i < gain.length; i++) {
      int cur = prev + gain[i];
      if (cur > max) {
        max = cur;
      }

      prev = cur;
    }

    return max;
  }
}
