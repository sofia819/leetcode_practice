"""
700. Search in a Binary Search Tree
https://leetcode.com/problems/search-in-a-binary-search-tree/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    
    def searchBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        q = [root]
        
        while q != []:
            cur = q.pop(0)
            if cur == None:
                return None
            
            if cur.val == val:
                return cur
            
            if cur.val < val:
                q.append(cur.right)
            else:
                q.append(cur.left)