/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * Copy nums1 array and merge as usual
 */

class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Counters to iterate throught the arrays
    int i = 0, j = 0, k = 0;

    // Extract nums1
    int[] n1 = Arrays.copyOfRange(nums1, 0, m);

    while (i < m && j < n) {
      if (n1[i] > nums2[j]) {
        nums1[k] = nums2[j];
        j++;
      } else {
        nums1[k] = n1[i];
        i++;
      }
      k++;
    }

    while (i < m) {
      nums1[k] = n1[i];
      i++;
      k++;
    }

    while (j < n) {
      nums1[k] = nums2[j];
      j++;
      k++;
    }
  }
}
