"""
41. First Missing Positive
https://leetcode.com/problems/first-missing-positive/
Using this solution: https://www.youtube.com/watch?v=2QugZILS_Q8
"""


class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        oneExists = False
        for i in nums:
            if i == 1:
                oneExists = True

        if not oneExists:
            return 1

        for i, val in enumerate(nums):
            if val <= 0 or val > len(nums):
                nums[i] = 1

        for i in range(len(nums)):
            iAbs = abs(nums[i])

            if iAbs < len(nums):
                nums[iAbs] = -1 * abs(nums[iAbs])
            else:
                nums[0] = -1 * abs(nums[0])

        for i in range(1, len(nums)):
            if nums[i] > 0:
                return i

        if nums[0] > 0:
            return len(nums)

        return len(nums) + 1
