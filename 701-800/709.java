/**
 * 709. To Lower Case
 * https://leetcode.com/problems/to-lower-case/
 */

class Solution {
  public String toLowerCase(String str) {
      String sNew = "";
      
      for(char c: str.toCharArray()){
          if( (int)(c) <= 'Z' && (int)(c) >= 'A'){
              sNew += "" + (char)(c + 32);
          }
          else
              sNew += "" + c;
      }
      
      return sNew;
  }
}