"""
226. Invert Binary Tree
https://leetcode.com/problems/invert-binary-tree/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root:
            tmp = root.left
            root.left = root.right
            root.right = tmp
            
            if root.left:
                self.invertTree(root.left)
            if root.right:
                self.invertTree(root.right)
        
        
        
        return root