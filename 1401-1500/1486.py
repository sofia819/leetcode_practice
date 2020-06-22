"""
1486. XOR Operation in an Array
https://leetcode.com/problems/xor-operation-in-an-array/
"""

class Solution(object):
    def xorOperation(self, n, start):
        """
        :type n: int
        :type start: int
        :rtype: int
        """
        ans = start
        for i in range(1, n):
            ans ^= start+2*i
        return ans