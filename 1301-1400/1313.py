"""
1313. Decompress Run-Length Encoded List
https://leetcode.com/problems/decompress-run-length-encoded-list/
"""

class Solution(object):
    def decompressRLElist(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        for i in range(0, len(nums), 2):
            if i % 2 == 0:
                result += nums[i] * [nums[i + 1]]
        return result