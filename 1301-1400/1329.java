/**
 * 1329. Sort the Matrix Diagonally
 * https://leetcode.com/problems/sort-the-matrix-diagonally/
 */

 class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // Sort each diagonal that starts from the first row
        for(int x = 0; x < mat[0].length; x++) {
            sortDiagonal(mat, x, 0);
        }
        
        // Sort each diagonal that starts from the first column
        for(int y = 1; y < mat.length; y++) {
            sortDiagonal(mat, 0, y);
        }
        return mat;
    }
    
    public void sortDiagonal(int[][] mat, int x, int y) {
        // Get all the values in this diagonal
        ArrayList<Integer> diagonal = new ArrayList<Integer>();
        int curX = x;
        int curY = y;
        while (curX < mat[0].length && curY < mat.length) {
            diagonal.add(mat[curY][curX]);
            curX++;
            curY++;
        }        
        // Sort the diagonal
        Collections.sort(diagonal);
        
        // Refill the diagonal with the new sorted values
        int counter = 0;
        curX = x;
        curY = y;
        while (curX < mat[0].length && curY < mat.length) {
            mat[curY][curX] = diagonal.get(counter++);
            curX++;
            curY++;
        }     
    }
}