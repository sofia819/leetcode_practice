"""
763. Partition Labels
https://leetcode.com/problems/partition-labels/
"""

class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        lastSeen = {}
        for index, s in enumerate(S):
            if s not in lastSeen:
                lastSeen[s] = index
            else:
                lastSeen[s] = index
        count = []
        prevMax = 0
        currentMax = -1
        for index, s in enumerate(S):
            if currentMax < lastSeen[s]:
                currentMax = lastSeen[s]
            if currentMax == index:
                count.append(currentMax - prevMax + 1)
                prevMax += count[-1]
        return count