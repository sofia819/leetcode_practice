"""
1282. Group the People Given the Group Size They Belong To
https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
"""

class Solution(object):
    def groupThePeople(self, groupSizes):
        """
        :type groupSizes: List[int]
        :rtype: List[List[int]]
        """
        # build a hashmap of key -> [indices]
        result = []
        hashMap = dict()
        for index, val in enumerate(groupSizes):
            if val not in hashMap:
                hashMap[val] = []
            hashMap[val].append(index)

        # for each key -> [indices]
        for key in hashMap:
            lst = hashMap[key]
            cur = 0
            # get the sublists for that key (group size)
            while(cur < len(lst)):
                result.append(lst[cur:cur+key])
                cur += key
        
        return result