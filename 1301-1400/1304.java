/**
 * 1304. Find N Unique Integers Sum up to Zero
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/ 
 */

 class Solution {
    public int[] sumZero(int n) {
        int sum = 0;
        int[] ans = new int[n];
        for(int i = 1; i < n; i++) {
            sum += i;
            ans[i] = i;
        }
        ans[0] = -1 * sum;
        return ans;
    }
}