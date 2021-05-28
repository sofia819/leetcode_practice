/**
 * 1588. Sum of All Odd Length Subarrays
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 *
 * Brute force solution
 */

class Solution {

  public int sumOddLengthSubarrays(int[] arr) {
    int results = 0;
    // For each element in the array
    for (int i = 0; i < arr.length; i++) {
      // Get the odd length subarrays
      for (int j = 1; i + j <= arr.length; j += 2) {
        results += sumArray(Arrays.copyOfRange(arr, i, i + j));
      }
    }
    return results;
  }

  private int sumArray(int[] arr) {
    return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
  }
}
