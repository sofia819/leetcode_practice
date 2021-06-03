/**
 * 1688. Count of Matches in Tournament
 * https://leetcode.com/problems/count-of-matches-in-tournament/
 */

class Solution {

  public int numberOfMatches(int n) {
    // Need to eliminate n - 1 teams to leave one winner
    return n - 1;
  }
}
