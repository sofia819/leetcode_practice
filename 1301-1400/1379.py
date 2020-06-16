"""
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getTargetCopy(self, original, cloned, target):
        """
        :type original: TreeNode
        :type cloned: TreeNode
        :type target: TreeNode
        :rtype: TreeNode
        """
        return self.DFS(cloned, target)
        
    def DFS(self, root, target):
        if root:
            if root.val == target.val:
                return root
            left = self.DFS(root.left, target)
            right = self.DFS(root.right, target)
            
            if right:
                return right
            if left:
                return left
        else:
            return None
            