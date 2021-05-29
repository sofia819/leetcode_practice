/**
 * 692. Top K Frequent Words
 * https://leetcode.com/problems/top-k-frequent-words/
 */

class Solution {

  public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < words.length; i++) {
      if (!map.containsKey(words[i])) {
        map.put(words[i], 1);
      }
      map.put(words[i], 1 + map.get(words[i]));
    }

    List<String> results = map
      .entrySet()
      .stream()
      .sorted(
        Comparator
          .comparing(Map.Entry<String, Integer>::getValue)
          .reversed()
          .thenComparing(Map.Entry::getKey)
      )
      .limit(k)
      .map(Map.Entry::getKey)
      .collect(Collectors.toList());

    return results;
  }
}
