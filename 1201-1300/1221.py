"""
1221. Split a String in Balanced Strings
https://leetcode.com/problems/split-a-string-in-balanced-strings/
"""

class Solution(object):
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        """
        L is positive and R is negative
        if cur is 0 that means we have an equal amount of Ls and Rs and we have a valid substring
        """
        cur = 0
        ans = 0
        for c in s:
            if c == 'L':
                cur += 1
            else:
                cur -= 1
            if cur == 0:
                cur = 0
                ans += 1
                
        return ans