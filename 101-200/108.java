/**
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  public TreeNode sortedArrayToBST(int[] nums) {
    return makeTree(0, nums.length, nums);
  }

  private TreeNode makeTree(int start, int end, int[] nums) {
    if (end <= start) {
      return null;
    }
    if (end - start == 1) {
      return new TreeNode(nums[start]);
    }
    int mid = (start + end) / 2;
    TreeNode midNode = new TreeNode(nums[mid]);
    midNode.left = makeTree(start, mid, nums);
    midNode.right = makeTree(mid + 1, end, nums);
    return midNode;
  }
}
