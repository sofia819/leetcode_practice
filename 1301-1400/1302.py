"""
1302. Deepest Leaves Sum
https://leetcode.com/problems/deepest-leaves-sum/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def deepestLeavesSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        stack = [root]
        newStack = []
        total = 0
        
        # BFS concept
        while stack:
            last = stack.pop(-1)
            total += last.val
            if last.left:
                newStack.append(last.left)
            if last.right:
                newStack.append(last.right)
            if not stack and newStack:
                stack = newStack
                newStack = []
                total = 0
    
        return total