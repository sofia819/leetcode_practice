/**
 * 1614. Maximum Nesting Depth of the Parentheses
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */

class Solution {

  public int maxDepth(String s) {
    int max = 0, cur = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        max = Math.max(max, ++cur);
      }

      if (s.charAt(i) == ')') {
        --cur;
      }
    }
    return max;
  }
}
