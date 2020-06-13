"""
1315. Sum of Nodes with Even-Valued Grandparent
https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumEvenGrandparent(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        s = 0
        # even grandparent
        if root and root.val % 2 == 0:
            if root.left:
                if root.left.left:
                    s += root.left.left.val
                if root.left.right:
                    s += root.left.right.val
            if root.right:
                if root.right.left:
                    s += root.right.left.val
                if root.right.right:
                    s += root.right.right.val
                    
        if root.left:
            s += self.sumEvenGrandparent(root.left)
        if root.right:
            s += self.sumEvenGrandparent(root.right)
            
        return s