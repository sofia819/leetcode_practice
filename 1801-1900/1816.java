/**
 * 1816. Truncate Sentence
 * https://leetcode.com/problems/truncate-sentence/
 */

class Solution {

  public String truncateSentence(String s, int k) {
    String[] results = new String[k];
    String[] sentence = s.split(" ");
    for (int i = 0; i < k; i++) {
      results[i] = sentence[i];
    }
    return String.join(" ", results);
  }
}
