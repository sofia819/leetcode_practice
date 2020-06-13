"""
1342. Number of Steps to Reduce a Number to Zero
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
"""

class Solution(object):
    def numberOfSteps (self, num):
        """
        :type num: int
        :rtype: int
        """
        x = 0
        while num > 0:
            if num % 2:
                num -= 1
            else:
                num /= 2
            x += 1
        return x        