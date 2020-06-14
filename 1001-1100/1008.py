"""
1008. Construct Binary Search Tree from Preorder Traversal
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
Using https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/252722/Python-stack-solution-beats-100-on-runtime-and-memory
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
"""
[8,5,1,7,10,12]
stack:
i = 5, stack = 8,
i = 1, stack = 8, 5
i = 7, stack = 8, 5, 1
i = 10, stack = 8, 5, 1, 7
i = 12, stack = 10
end, stack = 12
"""
class Solution(object):
    def bstFromPreorder(self, preorder):
        """
        :type preorder: List[int]
        :rtype: TreeNode
        """
        root = TreeNode(preorder[0])
        stack = [root]
        
        for value in preorder[1:]:
            if value < stack[-1].val:
                stack[-1].left = TreeNode(value)
                stack.append(stack[-1].left)
            else:
                while stack and stack[-1].val < value:
                    last = stack.pop()
                    
                last.right = TreeNode(value)
                stack.append(last.right)
        return root