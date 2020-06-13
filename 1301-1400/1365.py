"""
1365. How Many Numbers Are Smaller Than the Current Number
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
"""

class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        x = 0
        for i in range(len(nums)):
            for j in nums:
                if nums[i] > j:
                    x += 1
            result.append(x)
            x = 0
        return result