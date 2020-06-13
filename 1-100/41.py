"""
41. First Missing Positive
https://leetcode.com/problems/first-missing-positive/
Using this solution: https://www.youtube.com/watch?v=9SnkdYXNIzM
"""


class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)

        # check if 1 exists
        oneExists = False
        for i in nums:
            if i == 1:
                oneExists = True
        if not oneExists:
            return 1

        # change negatives and num > len(nums) to 1 to ignore them
        for i, val in enumerate(nums):
            if val <= 0 or val > n:
                nums[i] = 1

        for i in nums:
            iAbs = abs(i)
            if nums[iAbs - 1] > 0:
                nums[iAbs - 1] *= -1

        for i in range(0, len(nums)):
            if nums[i] > 0:
                return i + 1

        if nums[0] > 0:
            return n

        return n + 1
