/**
 * 1828. Queries on Number of Points Inside a Circle
 * https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 */

class Solution {

  public int[] countPoints(int[][] points, int[][] queries) {
    int[] results = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int xc = queries[i][0];
      int yc = queries[i][1];
      int r = queries[i][2];

      for (int j = 0; j < points.length; j++) {
        // If istance between two points <= r, then th epoint is inside the circle
        if (calcDistance(points[j][0], points[j][1], xc, yc) <= r) {
          results[i]++;
        }
      }
    }

    return results;
  }

  public double calcDistance(int xp, int yp, int xc, int yc) {
    return Math.sqrt(Math.pow(xp - xc, 2) + Math.pow(yp - yc, 2));
  }
}
