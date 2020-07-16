/**
 * 1512. Number of Good Pairs
 * https://leetcode.com/problems/number-of-good-pairs/
 */

 class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        
        for(int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                 map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > 2) {
                ans += GoodPairs(value);
            }
            if (value == 2) {
                ans += 1;
            }
        }
        
        return ans;
    }
    
    public int GoodPairs(int x) {
        int ans = 1;
        for (int i = 2; i < x; i++) {
            ans += i;
        }
        return ans;
    }
}