/**
 * 300. Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Reviewed the DP solution from solutions on LeetCode
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function (nums) {
  if (nums.length === 0) {
    return 0;
  }

  const lis = [];
  lis[0] = 1;

  for (let i = 1; i < nums.length; i++) {
    let maxVal = 0;
    for (let j = 0; j < i; j++) {
      if (nums[i] > nums[j]) {
        maxVal = Math.max(maxVal, lis[j]);
      }
    }
    lis[i] = maxVal + 1;
  }
  return Math.max(...lis);
};
