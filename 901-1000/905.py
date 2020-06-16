"""
905. Sort Array By Parity
https://leetcode.com/problems/sort-array-by-parity/
"""

class Solution(object):
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        odd = []
        ans = []
        for i in A:
            if i % 2 == 0:
                ans.append(i)
            else:
                odd.append(i)
        return ans + odd