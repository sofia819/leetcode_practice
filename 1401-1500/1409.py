"""
1409. Queries on a Permutation With Key
https://leetcode.com/problems/queries-on-a-permutation-with-key/
"""

class Solution(object):
    def processQueries(self, queries, m):
        """
        :type queries: List[int]
        :type m: int
        :rtype: List[int]
        """
        p = range(1, m+1)
        ans = []
        for q in queries:
            ans.append(p.index(q))
            p.pop(ans[-1])
            p.insert(0, q)
        return ans