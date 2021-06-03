/**
 * 1859. Sorting the Sentence
 * https://leetcode.com/problems/sorting-the-sentence/
 */

class Solution {

  public String sortSentence(String s) {
    String[] sentence = s.split(" ");
    String[] results = new String[sentence.length];

    for (String str : sentence) {
      int index = str.charAt(str.length() - 1) - '1';
      results[index] = str.substring(0, str.length() - 1);
    }

    return String.join(" ", results);
  }
}
