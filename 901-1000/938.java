/**
 * 938. Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        traverse(root, L, R);

        return sum;
    }

    public void traverse(TreeNode root, int L, int R) {
        if (root.val <= R && root.val >= L)
            sum += root.val;

        if (root.left != null)
            traverse(root.left, L, R);

        if (root.right != null)
            traverse(root.right, L, R);
    }
}