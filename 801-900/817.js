/**
 * 817. Linked List Components
 * https://leetcode.com/problems/linked-list-components/
 */

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number[]} G
 * @return {number}
 */
var numComponents = function (head, G) {
  const setG = new Set();
  G.forEach((val) => setG.add(val));

  let numComp = 0;
  let cur = head;
  /**
   * Go through all the nodes and increase component count if it is in the set
   * Skip the node if it is connected to an already counted connect component
   */
  while (cur !== null) {
    if (setG.has(cur.val)) {
      console.log(cur.val);
      while (cur.next !== null && setG.has(cur.next.val)) {
        cur = cur.next;
      }
      numComp = numComp + 1;
    }
    cur = cur.next;
  }
  return numComp;
};
