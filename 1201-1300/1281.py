"""
1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
"""

class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        nums = []
        while n > 0:
            nums.append(n % 10)
            n /= 10
        result = 1
        for i in nums:
            result = result * i - i
        return result