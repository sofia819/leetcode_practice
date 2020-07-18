class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] row : A) {
            reverseArray(row);
            invertArray(row);
        }
        return A;
    }
    
    private void reverseArray(int[] arr) {
        int arrLen = arr.length;
        for(int i = 0; i < arr.length / 2; i++) {
            swap(i, arrLen - 1 - i, arr);
        }
    }
    
    private void swap(int i1, int i2, int[] arr) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
    
    private void invertArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            // XOR
            arr[i] = arr[i] ^ 1;
        }
    }
}