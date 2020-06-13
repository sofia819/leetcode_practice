"""
75. Sort Colors
https://leetcode.com/problems/sort-colors/
"""

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        hashMap = {}
        for index, val in enumerate(nums):
            if val not in hashMap:
                hashMap[val] = []
            hashMap[val].append(index)
        
        result = []
        for i in range(3):
            if i in hashMap:
                result += len(hashMap[i]) * [i]
        
        for i in range(len(nums)):
            nums[i] = result[i]

