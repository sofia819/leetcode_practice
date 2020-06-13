"""
53. Maximum Subarray
https://leetcode.com/problems/maximum-subarray/
"""

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Kadane's algorithm
        maxSum = nums[0]
        curSum = nums[0]
        for i in range(1, len(nums)):
            if curSum + nums[i] > nums[i]:
                curSum += nums[i] 
            else:
                curSum = nums[i]
            if curSum > maxSum:
                maxSum = curSum
        return maxSum
            