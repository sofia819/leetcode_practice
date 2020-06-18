"""
1464. Maximum Product of Two Elements in an Array
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
"""

class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max1 = 0
        max2 = 0
        for i in nums:
            if i > max1:
                max2 = max1
                max1 = i
            elif i > max2:
                max2 = i
            else:
                continue
            if max2 > max1:
                tmp = max1
                max1 = max2
                max2 = tmp
                
        return (max1-1) * (max2-1)