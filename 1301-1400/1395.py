"""
1395. Count Number of Teams
https://leetcode.com/problems/count-number-of-teams/
"""
# O(n^3), come back to this later
class Solution(object):
    def numTeams(self, rating):
        """
        :type rating: List[int]
        :rtype: int
        """
        count = 0
        for i in range(len(rating)):
            for j in range(len(rating)):
                for k in range(len(rating)):
                    if i < j and j < k:
                        if (rating[i] > rating[j] > rating[k]) or (rating[i] < rating[j] < rating[k]):
                            count += 1
        
        return count