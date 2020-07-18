/**
 * 1305. All Elements in Two Binary Search Trees
 * https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
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
    
    List<Integer> arr = new ArrayList<Integer>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverseTree(root1);
        traverseTree(root2);
        
        Collections.sort(arr);
        return arr;
        
    }
    
    private void traverseTree(TreeNode root) {
        if (root != null) {
            arr.add(root.val);
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }
}