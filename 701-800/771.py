"""
771. Jewels and Stones
https://leetcode.com/problems/jewels-and-stones/
"""

class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        x = 0
        for jewel in list(J):
            x += S.count(jewel)
        return x