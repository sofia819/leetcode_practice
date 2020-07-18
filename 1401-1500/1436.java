/**
 * 1436. Destination City
 * https://leetcode.com/problems/destination-city/
 */

 class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<String, String>();
        // Use all end points as key and add to the map
        for(List<String> path : paths) {
            String end = path.get(1);
            map.put(end, null);
        }
        
        // Assign the paths in the map
        for(List<String> path : paths) {
            String start = path.get(0), end = path.get(1);
            if(map.containsKey(start)) {
                map.put(start, end);
            }
        }
        
        // Find out which point has no destination
        for(Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue() == null) {
                return entry.getKey();
            }
        }
        return null;
    }
}