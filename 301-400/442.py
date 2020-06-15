"""
442. Find All Duplicates in an Array
https://leetcode.com/problems/find-all-duplicates-in-an-array/
"""

class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        hashMap = {}
        dupe = []
        for i in nums:
            if i not in hashMap:
                hashMap[i] = True
            else:
                dupe.append(i)
        return dupe

"""
Solution 2
Use the original array to keep track of seen numbers.
Use the indices and "invalidate" numbers by turning that number at the index to negative.
class Solution(object):
    def findDuplicates(self, nums):
        dupe = []
        for i in range(len(nums)):
            index = abs(nums[i])
            if nums[index-1] > 0:
                nums[index-1] *= -1
            else:
                dupe.append(index)
        return dupe
"""