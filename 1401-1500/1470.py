"""
1470. Shuffle the Array
https://leetcode.com/problems/shuffle-the-array/
"""

class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        result = []
        for i in range(n):
            result.append(nums[i])
            x = i + n
            result.append(nums[x])
        return result