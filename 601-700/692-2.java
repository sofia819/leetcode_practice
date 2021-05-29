/**
 * 692. Top K Frequent Words
 * https://leetcode.com/problems/top-k-frequent-words/
 */

class Solution {

  public List<String> topKFrequent(String[] words, int k) {
    // Put all entries in a hash map
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < words.length; i++) {
      if (!map.containsKey(words[i])) {
        map.put(words[i], 1);
      }
      map.put(words[i], 1 + map.get(words[i]));
    }

    // Put all map entries in a priority queue with a comparator
    Queue<WordFrequency> queue = new PriorityQueue<WordFrequency>(
      // If the values are the same, we want to sort by their key
      // Else, wee sort by values in reverse
      (a, b) -> a.value == b.value ? a.key.compareTo(b.key) : b.value - a.value
    );

    // Add all the map entries to the queue
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      queue.add(new WordFrequency(entry.getKey(), entry.getValue()));
    }

    // Get the first k results
    ArrayList<String> results = new ArrayList<String>();
    while (k > 0) {
      results.add(queue.poll().key);
      k--;
    }

    return results;
  }
}

// This is a helper class to compare the queue entries
class WordFrequency {

  String key;
  int value;

  public WordFrequency(String key, int value) {
    this.key = key;
    this.value = value;
  }
}
