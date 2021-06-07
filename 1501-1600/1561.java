/**
 * 1561. Maximum Number of Coins You Can Get
 * https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
 */

class Solution {

  public int maxCoins(int[] piles) {
    int results = 0;

    Arrays.sort(piles);

    // We pick the coin piles piles.length / 3 times
    // Each time, we pick the min pile and the max two piles, the second max pile is ours
    // So start from the second to last, and skip 2 indices each time
    int turns = piles.length / 3;
    int index = piles.length - 2;
    while (turns > 0) {
      results += piles[index];
      index -= 2;
      turns--;
    }

    return results;
  }
}
