/**
 * 1791. Find Center of Star Graph
 * https://leetcode.com/problems/find-center-of-star-graph/
 */

class Solution {

  public int findCenter(int[][] edges) {
    // Only need to check the first two edges since there must be a common node
    return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]
      ? edges[0][0]
      : edges[0][1];
  }
}
