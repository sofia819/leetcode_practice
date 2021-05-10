/**
 * 1637. Widest Vertical Area Between Two Points Containing No Points
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */

import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
      // Sort the points first by x so neighbouring points are next to each other
      Arrays.sort(points, (int[] p1, int[] p2) -> p2[0] - p1[0]);
      
      // Find the widest x after the points are sorted
      int max = 0;
      for (int i = 1; i < points.length; i++) {
        max = Math.max(max, points[i - 1][0] - points[i][0]);
      }
      
      
      return max;
    }
}