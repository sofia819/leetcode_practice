/**
 * 1299. Replace Elements with Greatest Element on Right Side
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/discuss/544507/I-don't-understand-the-question.
 */

 class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        int max = 0;
        for(int i = arr.length - 2; i >= 0; i--){
            int current = arr[i + 1];
            max = Math.max(current, max);
            ans[i] = max;
        }
        ans[len - 1] = -1;
        return ans;
    }
}