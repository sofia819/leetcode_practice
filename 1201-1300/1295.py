"""
1295. Find Numbers with Even Number of Digits
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
"""

class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        for i in nums:
            count = 0
            while i > 0:
                i /= 10
                count += 1
            ans += 1 if count % 2 == 0 else 0
        return ans