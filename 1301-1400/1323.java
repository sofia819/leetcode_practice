/**
 * 1323. Maximum 69 Number
 * https://leetcode.com/problems/maximum-69-number/
 */

 class Solution {
    public int maximum69Number (int num) {
        int maxSix = 0;
        int place = 0;
        int tempNum = num;
        while(tempNum > 0) {
            place++;
            if (tempNum % 10 == 6) {
                maxSix = place;
            }
            tempNum /= 10; 
        }
        return num + 3 * (int)Math.pow(10, maxSix - 1);
    }
}