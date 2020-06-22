"""
1252. Cells with Odd Values in a Matrix
https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
"""

class Solution(object):
    def oddCells(self, n, m, indices):
        """
        :type n: int
        :type m: int
        :type indices: List[List[int]]
        :rtype: int
        """
        # count the number of times each row and col are incremented
        row = {}
        col = {}
        for index in indices:
            if index[0] not in row:
                row[index[0]] = 0
            row[index[0]] += 1
            if index[1] not in col:
                col[index[1]] = 0
            col[index[1]] += 1
        
        count = 0
        for i in range(n):
            for j in range(m):
                s = 0
                if i in row:
                    s += row[i]
                if j in col:
                    s += col[j]
                if s % 2 != 0:
                    count += 1
        
        return count