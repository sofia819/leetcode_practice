/**
 * 1863. Sum of All Subset XOR Totals
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 */

class Solution {

  public int subsetXORSum(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    // Call the function recursively
    return xor(nums, 0, 0);
  }

  private int xor(int[] nums, int index, int sum) {
    if (index == nums.length) {
      return sum;
    }
    // There are two routes each element can take, either exclude or include
    return xor(nums, index + 1, sum) + xor(nums, index + 1, sum ^ nums[index]);
  }
}
