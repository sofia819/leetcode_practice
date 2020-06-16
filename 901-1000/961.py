"""
961. N-Repeated Element in Size 2N Array
https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
"""

class Solution(object):
    def repeatedNTimes(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        seen = {}
        for i in A:
            if i not in seen:
                seen[i] = True
            else:
                return i
            