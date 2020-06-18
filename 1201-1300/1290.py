"""
1290. Convert Binary Number in a Linked List to Integer
https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: ListNode
        :rtype: int
        """
        s = []
        while head:
            s.append(str(head.val))
            head = head.next
        return int(''.join(s), 2)