/**
 * 1773. Count Items Matching a Rule
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */

class Solution {

  public int countMatches(
    List<List<String>> items,
    String ruleKey,
    String ruleValue
  ) {
    int ruleIndex = -1;
    switch (ruleKey) {
      case "color":
        ruleIndex = 1;
        break;
      case "name":
        ruleIndex = 2;
        break;
      default:
        ruleIndex = 0;
        break;
    }

    int result = 0;
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).get(ruleIndex).equals(ruleValue)) {
        result++;
      }
    }
    return result;
  }
}
