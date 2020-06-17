"""
1038. Binary Search Tree to Greater Sum Tree
https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def __init__(self):
        self.index = 0
        
    def bstToGst(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        # get the nodes in reversed order
        # [8, 7, 6, 5, 4, 3, 2, 1]
        arr = []
        self.inOrder(root, arr)
        
        # keep a running sum of numbers greated
        s = [0]
        for i in range(1, len(arr)):
            s.append(s[i-1] + arr[i-1].val)
        
        # update each node's value
        for i in range(0, len(arr)):
            arr[i].val = s[i] + arr[i].val
        
        return root
        
    def inOrder(self, root, arr):
        if not root:
            return
        else:
            self.inOrder(root.right, arr)
            arr.insert(self.index, root)
            self.index += 1
            self.inOrder(root.left, arr)