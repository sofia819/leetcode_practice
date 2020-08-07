/**
 * 1528. Shuffle String
 * https://leetcode.com/problems/shuffle-string/
 */

 /**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    const ans = []
    for(let i = 0; i < indices.length; i++) {
        ans[indices[i]] = s.charAt(i)
    }
    return ans.join("")
};