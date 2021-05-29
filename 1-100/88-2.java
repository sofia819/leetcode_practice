/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * Traversing from the back. Idea taken from discussions.
 */

class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Counters to iterate throught the arrays
    int i = m - 1, j = n - 1, k = m + n - 1;

    while (0 <= i && 0 <= j) {
      if (nums1[i] < nums2[j]) {
        nums1[k] = nums2[j];
        j--;
        k--;
      } else {
        nums1[k] = nums1[i];
        i--;
        k--;
      }
    }

    // We only care about the second array because nums1 is already sorted.
    while (0 <= j) {
      nums1[k] = nums2[j];
      k--;
      j--;
    }
  }
}
