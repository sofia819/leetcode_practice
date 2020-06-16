"""
1389. Create Target Array in the Given Order
https://leetcode.com/problems/create-target-array-in-the-given-order/
"""

class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        target = []
        for i, val in enumerate(nums):
            target.insert(index[i], val)
        return target