/**
 * 1266. Minimum Time Visiting All Points
 * https://leetcode.com/problems/minimum-time-visiting-all-points/ 
 */

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i = 1; i < points.length; i++) {
            int horizontal = Math.abs(points[i - 1][0] - points[i][0]);
            int vertical = Math.abs(points[i - 1][1] - points[i][1]);

            // Same horizontal and vertical = diagonal moves
            // Difference between dx and dy = horizontal/vertical moves
            time += Math.max(horizontal, vertical);
        }
        
        return time;
    }
}