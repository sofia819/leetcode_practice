/**
 * 1021. Remove Outermost Parentheses
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * https://leetcode.com/problems/remove-outermost-parentheses/discuss/273884/Ridiculously-Simple-JAVA-O(n)-Solution-%2B-Explanation-0ms-Beats-100-Time-and-Memory
 */

// The counter emulates a stack
// When count reaches 0, it means it has found the outermost pair of parenthesis.
 class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    sb.append("(");
                }
                count++;
            }
            else {
                count--;
                if (count > 0) {
                    sb.append(")");
                }
            }
        }
        return sb.toString();
    }
}