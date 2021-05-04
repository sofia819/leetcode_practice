/**
 * 1769. Minimum Number of Operations to Move All Balls to Each Box
 * https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 */

class Solution {

  public int[] minOperations(String boxes) {
    int[] balls = new int[boxes.length()];
    for (int i = 0; i < boxes.length(); i++) {
      balls[i] = boxes.charAt(i) - 48;
    }

    int[] results = new int[boxes.length()];
    for (int i = 0; i < balls.length; i++) {
      for (int j = 0; j < balls.length; j++) {
        results[i] += Math.abs(i - j);
      }
    }

    return results;
  }
}
