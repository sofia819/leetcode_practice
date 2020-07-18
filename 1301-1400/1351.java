/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */

 class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                if(grid[row][col] < 0) {
                    ans += grid[row].length - col;
                    break;
                }
            }
        }
        return ans;
    }
}
