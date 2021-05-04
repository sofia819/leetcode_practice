/**
 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */

class Solution {

  public int minPartitions(String n) {
    int max = 0;
    for (int i = 0; i < n.length(); i++) {
      int num = n.charAt(i) - 48;
      if (num > max) {
        max = num;
      }
    }
    return max;
  }
}
