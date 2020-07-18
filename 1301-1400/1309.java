/**
 * 1309. Decrypt String from Alphabet to Integer Mapping
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            if(i + 2 <= s.length() - 1 && s.charAt(i + 2) == '#') {
                sb.append(numToChar(s.substring(i, i + 2)));
                i += 3;
            }
            else {
                sb.append(numToChar(s.substring(i, i + 1)));
                i++;
            }
        }
        return sb.toString();
    }
    
    private char numToChar(String s) {
        return (char)(Integer.parseInt(s) + 96);
    }
}