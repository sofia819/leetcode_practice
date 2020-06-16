"""
977. Squares of a Sorted Array
https://leetcode.com/problems/squares-of-a-sorted-array/
"""

class Solution(object):
    def sortedSquares(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        neg = []
        pos = []
        sq = []

        for n in A:
            if n < 0:
                neg.append(n)
            else:
                pos.append(n)

        for n in pos:
            while neg and abs(neg[-1]) <= n:
                last = neg.pop(-1)
                sq.append(last ** 2)
            sq.append(n ** 2)

        for i in neg[::-1]:
            sq.append(i * i)

        return sq            