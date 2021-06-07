/**
 * 1817. Finding the Users Active Minutes
 * https://leetcode.com/problems/finding-the-users-active-minutes/
 */

class Solution {

  public int[] findingUsersActiveMinutes(int[][] logs, int k) {
    HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
    int[] results = new int[k];

    // Go through all the logs and record each user's unique activity minute
    for (int i = 0; i < logs.length; i++) {
      int userId = logs[i][0];
      int actionMinute = logs[i][1];
      if (!map.containsKey(userId)) {
        HashSet<Integer> actions = new HashSet<Integer>();
        actions.add(actionMinute);
        map.put(userId, actions);
      } else {
        HashSet<Integer> actions = map.get(userId);
        actions.add(actionMinute);
      }
    }

    // Go through the map and calculate the actions each user took
    for (Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
      results[entry.getValue().size() - 1]++;
    }

    return results;
  }
}
