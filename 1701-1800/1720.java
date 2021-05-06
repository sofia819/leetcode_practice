/**
 * 1720. Decode XORed Array
 * https://leetcode.com/problems/decode-xored-array/
 */

class Solution {

  public int[] decode(int[] encoded, int first) {
    int[] results = new int[encoded.length + 1];
    results[0] = first;
    for (int i = 1; i < encoded.length + 1; i++) {
      results[i] = results[i - 1] ^ encoded[i - 1];
    }
    return results;
  }
}
